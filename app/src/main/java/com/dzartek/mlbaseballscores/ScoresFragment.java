package com.dzartek.mlbaseballscores;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.dzartek.mlbaseballscores.model.Baseball;
import com.dzartek.mlbaseballscores.parsers.BaseballJSONParser;

import java.util.Calendar;
import java.util.List;

/**
 * Created by dzarrillo on 8/25/2015.
 */
public class ScoresFragment extends Fragment implements TextView.OnTouchListener {
    private TextView tvBaseballScores, tvScores, tvDate;
    private int year, month, day;
    private String sMonth, sDay;
    protected List<Baseball> baseballList;
    private ProgressBar pb;


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
            requestData(feeds);
        } else {
            Toast.makeText(getActivity(), "Network is not available!", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_scores, container, false);

        tvBaseballScores = (TextView) v.findViewById(R.id.tvBaseballScores);
        tvScores = (TextView) v.findViewById(R.id.tvScores);

        tvDate = (TextView) v.findViewById(R.id.tvDate);
        tvDate.setText(year + "/" + sMonth + "/" + sDay);
        tvDate.setOnTouchListener(this);

        return v;

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
            case R.id.tvDate:

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
        StringBuilder sbTeams = new StringBuilder();
        StringBuilder sbScores = new StringBuilder();

        String homeTeamName, awayTeamName, homeScore, awayScore, inning_state, inning, status;

        if(baseballList == null) {
            tvBaseballScores.setText("No Data in Web Service!" + "\n" +
            "Please select another date!");
            return;
        }

        for (Baseball b : baseballList) {

            awayTeamName = String.format("%1$" + -(15) + "S", b.getAwayTeam().trim());
            homeTeamName = String.format("%1$" + -(15) + "S", b.getHomeTeam().trim());
            homeScore = String.format("%1$" + -(3) + "S", b.getHomeScore().trim());
            awayScore = String.format("%1$" + -(3) + "S", b.getAwayScore().trim());
            status = String.format("%1$" + -(8) + "S", b.getStatus().trim());
            inning = String.format("%1$" + -(2) + "S", b.getInning().trim()) + "th";
            inning_state = b.getInning_state().length() >= 3 ? String.format("%1$" + -(2) + "S", b.getInning_state().trim()) : "";
            //inning_st            ate = b.getInning_state().trim();

            if (Integer.parseInt(b.getAwayScore()) > Integer.parseInt(b.getHomeScore())) {

                sbTeams.append("\n")
                        .append(awayTeamName)
                        .append("\n")
                        .append(homeTeamName)
                        .append("\n");

                sbScores.append("\n")
                        .append(awayScore)
                        .append("\n")
                        .append(homeScore)
                        .append("\n");

            } else if (Integer.parseInt(b.getAwayScore()) < Integer.parseInt(b.getHomeScore())) {
                sbTeams.append("\n")
                        .append(homeTeamName)
                        .append("\n")
                        .append(awayTeamName)
                        .append("\n");


                sbScores.append("\n")
                        .append(homeScore)
                        .append("\n")
                        .append(awayScore)
                        .append("\n");

            }

        }

        //tvBaseballScores.setText("");
        tvBaseballScores.setText(sbTeams);
        tvScores.setText(sbScores);

    }


    private class MyTask extends AsyncTask<String, String, List<Baseball>> {

        //  Runs before doInBackground, has access to main thread
        @Override
        protected void onPreExecute() {
            //tvBaseballScores.setText("Getting data");
        }

        @Override
        protected List<Baseball> doInBackground(String... params) {

            String content = HttpManager.getData(params[0]);
            baseballList = BaseballJSONParser.parseFeed(content);

            return baseballList;
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
