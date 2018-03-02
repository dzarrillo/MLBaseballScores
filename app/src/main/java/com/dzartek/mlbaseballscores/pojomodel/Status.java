
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("balls")
    @Expose
    private String balls;
    @SerializedName("ind")
    @Expose
    private String ind;
    @SerializedName("inning")
    @Expose
    private String inning;
    @SerializedName("inning_state")
    @Expose
    private String inningState;
    @SerializedName("is_no_hitter")
    @Expose
    private String isNoHitter;
    @SerializedName("is_perfect_game")
    @Expose
    private String isPerfectGame;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("outs")
    @Expose
    private String outs;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("strikes")
    @Expose
    private String strikes;
    @SerializedName("top_inning")
    @Expose
    private String topInning;

    public String getBalls() {
        return balls;
    }

    public void setBalls(String balls) {
        this.balls = balls;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public String getInning() {
        return inning;
    }

    public void setInning(String inning) {
        this.inning = inning;
    }

    public String getInningState() {
        return inningState;
    }

    public void setInningState(String inningState) {
        this.inningState = inningState;
    }

    public String getIsNoHitter() {
        return isNoHitter;
    }

    public void setIsNoHitter(String isNoHitter) {
        this.isNoHitter = isNoHitter;
    }

    public String getIsPerfectGame() {
        return isPerfectGame;
    }

    public void setIsPerfectGame(String isPerfectGame) {
        this.isPerfectGame = isPerfectGame;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOuts() {
        return outs;
    }

    public void setOuts(String outs) {
        this.outs = outs;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStrikes() {
        return strikes;
    }

    public void setStrikes(String strikes) {
        this.strikes = strikes;
    }

    public String getTopInning() {
        return topInning;
    }

    public void setTopInning(String topInning) {
        this.topInning = topInning;
    }

}
