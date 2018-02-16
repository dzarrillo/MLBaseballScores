package com.dzartek.mlbaseballscores;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dzartek.mlbaseballscores.model.Baseball;
import com.dzartek.mlbaseballscores.network.BaseballRetrofit;
import com.dzartek.mlbaseballscores.network.BaseballService;
import com.dzartek.mlbaseballscores.network.HttpManager;
import com.dzartek.mlbaseballscores.parsers.BaseballJSONParser;
import com.dzartek.mlbaseballscores.pojomodel.BaseballScores;
import com.dzartek.mlbaseballscores.utility.BaseDialogFragment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.dzartek.mlbaseballscores.network.HttpManager.getData;

/**
 * Created by dzarrillo on 8/25/2015.
 */
public class ScoresFragment extends Fragment implements TextView.OnTouchListener {
    private final String TAG = ScoresFragment.class.getName();
    @BindView(R.id.textViewDate) TextView mTextViewDate;
    @BindView(R.id.recyclerViewScores) RecyclerView mRecyclerViewScores;
    private ScoresAdapter mScoresAdapter;
    private int year, month, day;
    private String sMonth, sDay;
    protected List<Baseball> mBaseballList = new ArrayList<>();
    private ProgressBar pb;
    @NonNull private BaseballService mBaseballService;
    @NonNull private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public interface OnTouchBaseballDate{
        void onTouchDate(int year, int month, int day);
    }
    private OnTouchBaseballDate mDateCallback;

    public ScoresFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);

        //String feeds = "http://gd2.mlb.com/components/game/mlb/year_2015/month_08/day_30/master_scoreboard.json";


        if(this.getArguments() != null) {
            year = this.getArguments().getInt("Year", 0);
            month = this.getArguments().getInt("Month", 0);
            month += 1;
            day = this.getArguments().getInt("Day", 0);
        } else {
            year = Calendar.getInstance().get(Calendar.YEAR);
            month = 1 + Calendar.getInstance().get(Calendar.MONTH );
            day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        }

//        month = 8;
//        day = 5;
//        year = 2017;

        sMonth = (month > 9) ? Integer.toString(month) : "0" + Integer.toString(month);
        sDay = (day > 9) ? Integer.toString(day) : "0" + Integer.toString(day);

        String feeds = "http://gd2.mlb.com/components/game/mlb/year_" +
                year +
                "/month_" +
                sMonth +
                "/day_" +
                sDay +
                "/master_scoreboard.json";


        if (isOnLine()) {
            //  Background task
//            requestData(feeds);
            requestHttpManager(feeds);
        } else {
            DialogFragment dialog = new BaseDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("TITLE", "Data Alert");
            bundle.putString("MESSAGE", "Unable to retrieve data at this time.  " +
                    "Please verify if network is available and not in airplane mode.");
            dialog.setArguments(bundle);
            dialog.show(getFragmentManager(), "DialogFragment");
        }
    }

    private void requestHttpManager(String feeds) {
        mCompositeDisposable.add(Observable.fromCallable(() -> {
            return HttpManager.getData(feeds);


        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String feeds) throws Exception {
                        Log.d(TAG, "Subscibe - accept ");
                        mBaseballList = BaseballJSONParser.parseFeed(feeds);
                        updateDisplay();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d(TAG, "RxJava2, HTTP Error: " + throwable.getMessage());
                        DialogFragment dialog = new BaseDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("TITLE", "Network error");
                        bundle.putString("MESSAGE", "Unable to retrieve data at this time.");
                        dialog.setArguments(bundle);
                        dialog.show(getFragmentManager(), "DialogFragment");
                    }
                }));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_scores, container, false);
        ButterKnife.bind(this, v);
        String myDate = year + "/" + sMonth + "/" + sDay;
        mTextViewDate.setText(myDate);
        mTextViewDate.setOnTouchListener(this);

        if(savedInstanceState != null){
            mBaseballService = new BaseballRetrofit().getBaseballRxSingleService();
            requestBaseballScores();
        }

        initializeRecyclerView();

        return v;

    }

    private void initializeRecyclerView() {
        mScoresAdapter = new ScoresAdapter(mBaseballList);
        mRecyclerViewScores.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false ));
        mRecyclerViewScores.setHasFixedSize(true);
        mRecyclerViewScores.setAdapter(mScoresAdapter);
    }

    private void requestBaseballScores() {
        mCompositeDisposable.add(mBaseballService.getBaseballScores()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Consumer<BaseballScores>() {
                       @Override
                       public void accept(BaseballScores baseballScores) throws Exception {
                           if (baseballScores != null) {
                               populateBaseballList(baseballScores);
                           }
                       }
                   },
                new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d(TAG, "RxJava2, HTTP Error: " + throwable.getMessage());

                    }
                }

        ));
    }

    private void populateBaseballList(BaseballScores baseballScores) {
        mBaseballList.clear();
        if(baseballScores != null){

            Baseball baseball = new Baseball();
        } else{
            DialogFragment dialog = new BaseDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("TITLE", "Network Alert");
            bundle.putString("MESSAGE", "Unable to retrieve data at this time.  " +
                    "Please verify if network is available and not in airplane mode.");

            dialog.setArguments(bundle);
            dialog.show(getFragmentManager(), "DialogFragment");
        }

    }

    @Override
    public void onDestroy() {
        if((mCompositeDisposable != null) && (!mCompositeDisposable.isDisposed())){
            mCompositeDisposable.clear();
        }
        super.onDestroy();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //Make sure host implements the method
        try {
            mDateCallback = (OnTouchBaseballDate) activity;
        } catch (Exception e){
            throw new ClassCastException(activity.toString() +
            " must implement OnSelectedBaseballDate");
        }
    }


    protected boolean isOnLine() {
        ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (v.getId()) {
            case R.id.textViewDate:

                year=2015;
                month=8;
                day=30;

                // Send the event back to host
                mDateCallback.onTouchDate(year, month, day);
                break;
        }

        return false;
    }

    private void requestData(String uri) {
        //  Do background task
        MyTask task = new MyTask();
        task.execute(uri);
    }


    private void updateDisplay() {

        if(mBaseballList != null){
            mScoresAdapter.updateData(mBaseballList);
        } else {
//            Toast.makeText(getActivity(), "Data not available!", Toast.LENGTH_SHORT).show();
            DialogFragment dialog = new BaseDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("TITLE", "Data Alert");
            bundle.putString("MESSAGE", "Unable to retrieve data at this time.  " +
                    "Please verify if games were scheduled for selected date.");

            dialog.setArguments(bundle);
            dialog.show(getFragmentManager(), "DialogFragment");
        }
    }


    private class MyTask extends AsyncTask<String, String, List<Baseball>> {

        //  Runs before doInBackground, has access to main thread
        @Override
        protected void onPreExecute() {
            //tvBaseballScores.setText("Getting data");
        }

        @Override
        protected List<Baseball> doInBackground(String... params) {

            String content = getData(params[0]);
            mBaseballList = BaseballJSONParser.parseFeed(content);

            return mBaseballList;
        }

        //  Runs after doInbackground, has access to main thread
        @Override
        protected void onPostExecute(List<Baseball> result) {

            /*
            if (result == null) {
                Toast.makeText(getActivity(), "Data file not available in web service!", Toast.LENGTH_LONG).show();
                return;
            }
            */
            updateDisplay();
        }

        @Override
        protected void onProgressUpdate(String... values) {
            // Update display with the first param values[0] - from publishProgress

        }
    }
}
