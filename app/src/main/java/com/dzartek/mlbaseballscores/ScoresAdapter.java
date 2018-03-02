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
    private List<Baseball> mBaseballList = new ArrayList<>();

    public ScoresAdapter(List<Baseball> mBaseballList) {
        this.mBaseballList = mBaseballList;
    }

    @Override
    public ScoresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(parent instanceof RecyclerView){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scores, parent, false);
            v.setFocusable(true);
            return new ScoresViewHolder(v);
        } else {
            throw new RuntimeException(TAG + " Not bound to RecyclerView");
        }
    }

    @Override
    public void onBindViewHolder(ScoresViewHolder holder, int position) {
        String val = "0";
        holder.textViewStatus.setText(mBaseballList.get(holder.getAdapterPosition()).getStatus());
        holder.textViewHomeTeam.setText(mBaseballList.get(holder.getAdapterPosition()).getHomeTeam());
        holder.textViewHscore.setText(mBaseballList.get(holder.getAdapterPosition()).getHomeScore());
        holder.textViewHhits.setText(mBaseballList.get(holder.getAdapterPosition()).getHomeHits());
        holder.textViewHerrors.setText(mBaseballList.get(holder.getAdapterPosition()).getHomeErrors());

        holder.textViewAwayTeam.setText(mBaseballList.get(holder.getAdapterPosition()).getAwayTeam());
        holder.textViewAscore.setText(mBaseballList.get(holder.getAdapterPosition()).getAwayScore());
        holder.textViewAhits.setText(mBaseballList.get(holder.getAdapterPosition()).getAwayHits());
        holder.textViewAerrors.setText(mBaseballList.get(holder.getAdapterPosition()).getAwayErrors());

        holder.textViewWinPitcher.setText(mBaseballList.get(holder.getAdapterPosition()).getWinningPitcher());
        String wRecord = "(" + mBaseballList.get(holder.getAdapterPosition()).getWinningWins()
                + " - " + mBaseballList.get(holder.getAdapterPosition()).getWinningLosses() + ")";
        holder.textViewWinPitcherRec.setText(wRecord);
        holder.textViewLosePitcher.setText(mBaseballList.get(holder.getAdapterPosition()).getLosingPitcher());
        String lRecord = "(" + mBaseballList.get(holder.getAdapterPosition()).getLosingWins()
                + " - " + mBaseballList.get(holder.getAdapterPosition()).getLosingLosses() +")";
        holder.textViewLossPitcherRec.setText(lRecord);
    }

    @Override
    public int getItemCount() {
        return mBaseballList != null ? mBaseballList.size() : 0;
    }

    public void updateData(List<Baseball> mBaseballList){
        this.mBaseballList.clear();
        this.mBaseballList = mBaseballList;
        this.notifyDataSetChanged();
    }

    public class ScoresViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.textViewStatus) TextView textViewStatus;
        @BindView(R.id.textViewHomeTeam) TextView textViewHomeTeam;
        @BindView(R.id.textViewHscore) TextView textViewHscore;
        @BindView(R.id.textViewHhits) TextView textViewHhits;
        @BindView(R.id.textViewHerrors) TextView textViewHerrors;
        @BindView(R.id.textViewAwayTeam) TextView textViewAwayTeam;
        @BindView(R.id.textViewAscore) TextView textViewAscore;
        @BindView(R.id.textViewAhits) TextView textViewAhits;
        @BindView(R.id.textViewAerrors) TextView textViewAerrors;
        @BindView(R.id.textViewWinPitcher) TextView textViewWinPitcher;
        @BindView(R.id.textViewWinPitcherRec) TextView textViewWinPitcherRec;
        @BindView(R.id.textViewLosePitcher) TextView textViewLosePitcher;
        @BindView(R.id.textViewLossPitcherRec) TextView textViewLossPitcherRec;

        public ScoresViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
