
package com.dzartek.mlbaseballscores.pojomodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Games {

    @SerializedName("game")
    @Expose
    private List<Game> game = null;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("modified_date")
    @Expose
    private String modifiedDate;
    @SerializedName("month")
    @Expose
    private String month;
    @SerializedName("next_day_date")
    @Expose
    private String nextDayDate;
    @SerializedName("xmlns:xs")
    @Expose
    private String xmlnsXs;
    @SerializedName("year")
    @Expose
    private String year;

    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNextDayDate() {
        return nextDayDate;
    }

    public void setNextDayDate(String nextDayDate) {
        this.nextDayDate = nextDayDate;
    }

    public String getXmlnsXs() {
        return xmlnsXs;
    }

    public void setXmlnsXs(String xmlnsXs) {
        this.xmlnsXs = xmlnsXs;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
