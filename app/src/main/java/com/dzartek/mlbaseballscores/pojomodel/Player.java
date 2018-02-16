
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("hr")
    @Expose
    private String hr;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("inning")
    @Expose
    private String inning;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("name_display_roster")
    @Expose
    private String nameDisplayRoster;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("runners")
    @Expose
    private String runners;
    @SerializedName("std_hr")
    @Expose
    private String stdHr;
    @SerializedName("team_code")
    @Expose
    private String teamCode;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInning() {
        return inning;
    }

    public void setInning(String inning) {
        this.inning = inning;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getNameDisplayRoster() {
        return nameDisplayRoster;
    }

    public void setNameDisplayRoster(String nameDisplayRoster) {
        this.nameDisplayRoster = nameDisplayRoster;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRunners() {
        return runners;
    }

    public void setRunners(String runners) {
        this.runners = runners;
    }

    public String getStdHr() {
        return stdHr;
    }

    public void setStdHr(String stdHr) {
        this.stdHr = stdHr;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

}
