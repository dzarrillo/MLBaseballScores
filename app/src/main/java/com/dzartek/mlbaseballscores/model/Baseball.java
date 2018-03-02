package com.dzartek.mlbaseballscores.model;

/**
 * Created by dzarrillo on 8/25/2015.
 */
public class Baseball {
    private String homeTeam;
    private String homeTeamCity;
    private String awayTeam;
    private String awayTeamCity;
    private String homeScore;
    private String awayScore;
    private String status;
    private String inning;
    private String inning_state;
    private String homeHits;
    private String awayHits;
    private String homeErrors;
    private String awayErrors;
    private String winningPitcher;
    private String winningWins;
    private String winningLosses;
    private String losingPitcher;
    private String losingWins;
    private String losingLosses;


    public String getInning_state() {
        return inning_state;
    }

    public void setInning_state(String inning_state) {
        this.inning_state = inning_state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInning() {
        return inning;
    }

    public void setInning(String inning) {
        this.inning = inning;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getHomeTeamCity() {
        return homeTeamCity;
    }

    public void setHomeTeamCity(String homeTeamCity) {
        this.homeTeamCity = homeTeamCity;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getAwayTeamCity() {
        return awayTeamCity;
    }

    public void setAwayTeamCity(String awayTeamCity) {
        this.awayTeamCity = awayTeamCity;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public String getHomeHits() {
        return homeHits;
    }

    public void setHomeHits(String homeHits) {
        this.homeHits = homeHits;
    }

    public String getAwayHits() {
        return awayHits;
    }

    public void setAwayHits(String awayHits) {
        this.awayHits = awayHits;
    }

    public String getHomeErrors() {
        return homeErrors;
    }

    public void setHomeErrors(String homeErrors) {
        this.homeErrors = homeErrors;
    }

    public String getAwayErrors() {
        return awayErrors;
    }

    public void setAwayErrors(String awayErrors) {
        this.awayErrors = awayErrors;
    }

    public String getWinningPitcher() {
        return winningPitcher;
    }

    public void setWinningPitcher(String winningPitcher) {
        this.winningPitcher = winningPitcher;
    }

    public String getWinningWins() {
        return winningWins;
    }

    public void setWinningWins(String winningWins) {
        this.winningWins = winningWins;
    }

    public String getWinningLosses() {
        return winningLosses;
    }

    public void setWinningLosses(String winningLosses) {
        this.winningLosses = winningLosses;
    }

    public String getLosingPitcher() {
        return losingPitcher;
    }

    public void setLosingPitcher(String losingPitcher) {
        this.losingPitcher = losingPitcher;
    }

    public String getLosingWins() {
        return losingWins;
    }

    public void setLosingWins(String losingWins) {
        this.losingWins = losingWins;
    }

    public String getLosingLosses() {
        return losingLosses;
    }

    public void setLosingLosses(String losingLosses) {
        this.losingLosses = losingLosses;
    }
}
