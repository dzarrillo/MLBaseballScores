
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class R {

    @SerializedName("away")
    @Expose
    private String away;
    @SerializedName("diff")
    @Expose
    private String diff;
    @SerializedName("home")
    @Expose
    private String home;

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

}
