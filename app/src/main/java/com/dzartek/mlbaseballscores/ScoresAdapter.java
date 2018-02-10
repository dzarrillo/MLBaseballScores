package com.dzartek.mlbaseballscores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dzartek.mlbaseballscores.model.Baseball;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dzarrillo on 2/10/2018.
 */

public class ScoresAdapter extends RecyclerView.Adapter<ScoresAdapter.ScoresViewHolder>{
    private final String TAG = ScoresAdapter.class.getName();
    private Context mContext;
    private List<Baseball> mBaseballList = new ArrayList<>();

    public ScoresAdapter(Context mContext, List<Baseball> mBaseballList) {
        this.mContext = mContext;
        this.mBaseballList = mBaseballList;
    }

    @Override
    public ScoresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(parent instanceof RecyclerView){
            View v = LayoutInflater.from(mContext).inflate(R.layout.item_scores, parent, false);
            v.setFocusable(true);
            return new ScoresViewHolder(v);
        } else {
            throw new RuntimeException(TAG + " Not bound to RecyclerView");
        }
    }

    @Override
    public void onBindViewHolder(ScoresViewHolder holder, int position) {
        String val = "0";
        holder.textViewHomeTeam.setText(mBaseballList.get(holder.getAdapterPosition()).getHomeTeam());
        holder.textViewHscore.setText(mBaseballList.get(holder.getAdapterPosition()).getHomeScore());
        holder.textViewHhits.setText(val);
        holder.textViewHomeTeam.setText(val);

        holder.textViewAwayTeam.setText(mBaseballList.get(holder.getAdapterPosition()).getAwayTeam());
        holder.textViewHscore.setText(mBaseballList.get(holder.getAdapterPosition()).getAwayScore());
        holder.textViewHhits.setText(val);
        holder.textViewHomeTeam.setText(val);
    }

    @Override
    public int getItemCount() {
        return mBaseballList != null ? mBaseballList.size() : 0;
    }


    public class ScoresViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.textViewHomeTeam) TextView textViewHomeTeam;
        @BindView(R.id.textViewHscore) TextView textViewHscore;
        @BindView(R.id.textViewHhits) TextView textViewHhits;
        @BindView(R.id.textViewHerrors) TextView textViewHerrors;
        @BindView(R.id.textViewAwayTeam) TextView textViewAwayTeam;
        @BindView(R.id.textViewAscore) TextView textViewAscore;
        @BindView(R.id.textViewAhits) TextView textViewAhits;
        @BindView(R.id.textViewAerrors) TextView textViewAerrors;

        public ScoresViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
