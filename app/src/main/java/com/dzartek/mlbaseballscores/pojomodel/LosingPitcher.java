
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LosingPitcher {

    @SerializedName("era")
    @Expose
    private String era;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("losses")
    @Expose
    private String losses;
    @SerializedName("name_display_roster")
    @Expose
    private String nameDisplayRoster;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("wins")
    @Expose
    private String wins;

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
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

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

}
