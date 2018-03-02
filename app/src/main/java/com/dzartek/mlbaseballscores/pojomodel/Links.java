
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("away_audio")
    @Expose
    private String awayAudio;
    @SerializedName("away_preview")
    @Expose
    private String awayPreview;
    @SerializedName("home_audio")
    @Expose
    private String homeAudio;
    @SerializedName("home_preview")
    @Expose
    private String homePreview;
    @SerializedName("mlbtv")
    @Expose
    private String mlbtv;
    @SerializedName("preview")
    @Expose
    private String preview;
    @SerializedName("tv_station")
    @Expose
    private String tvStation;
    @SerializedName("wrapup")
    @Expose
    private String wrapup;

    public String getAwayAudio() {
        return awayAudio;
    }

    public void setAwayAudio(String awayAudio) {
        this.awayAudio = awayAudio;
    }

    public String getAwayPreview() {
        return awayPreview;
    }

    public void setAwayPreview(String awayPreview) {
        this.awayPreview = awayPreview;
    }

    public String getHomeAudio() {
        return homeAudio;
    }

    public void setHomeAudio(String homeAudio) {
        this.homeAudio = homeAudio;
    }

    public String getHomePreview() {
        return homePreview;
    }

    public void setHomePreview(String homePreview) {
        this.homePreview = homePreview;
    }

    public String getMlbtv() {
        return mlbtv;
    }

    public void setMlbtv(String mlbtv) {
        this.mlbtv = mlbtv;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getTvStation() {
        return tvStation;
    }

    public void setTvStation(String tvStation) {
        this.tvStation = tvStation;
    }

    public String getWrapup() {
        return wrapup;
    }

    public void setWrapup(String wrapup) {
        this.wrapup = wrapup;
    }

}
