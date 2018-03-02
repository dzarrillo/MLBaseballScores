
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {

    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("broadcast")
    @Expose
    private Broadcast broadcast;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("home_runs")
    @Expose
    private HomeRuns homeRuns;
    @SerializedName("linescore")
    @Expose
    private Linescore linescore;
    @SerializedName("winning_pitcher")
    @Expose
    private WinningPitcher winningPitcher;
    @SerializedName("losing_pitcher")
    @Expose
    private LosingPitcher losingPitcher;
    @SerializedName("save_pitcher")
    @Expose
    private SavePitcher savePitcher;
    @SerializedName("video_thumbnail")
    @Expose
    private String videoThumbnail;
    @SerializedName("video_thumbnails")
    @Expose
    private VideoThumbnails videoThumbnails;
    @SerializedName("game_media")
    @Expose
    private GameMedia gameMedia;
    @SerializedName("ampm")
    @Expose
    private String ampm;
    @SerializedName("aw_lg_ampm")
    @Expose
    private String awLgAmpm;
    @SerializedName("away_ampm")
    @Expose
    private String awayAmpm;
    @SerializedName("away_code")
    @Expose
    private String awayCode;
    @SerializedName("away_division")
    @Expose
    private String awayDivision;
    @SerializedName("away_file_code")
    @Expose
    private String awayFileCode;
    @SerializedName("away_games_back")
    @Expose
    private String awayGamesBack;
    @SerializedName("away_games_back_wildcard")
    @Expose
    private String awayGamesBackWildcard;
    @SerializedName("away_league_id")
    @Expose
    private String awayLeagueId;
    @SerializedName("away_loss")
    @Expose
    private String awayLoss;
    @SerializedName("away_name_abbrev")
    @Expose
    private String awayNameAbbrev;
    @SerializedName("away_sport_code")
    @Expose
    private String awaySportCode;
    @SerializedName("away_team_city")
    @Expose
    private String awayTeamCity;
    @SerializedName("away_team_id")
    @Expose
    private String awayTeamId;
    @SerializedName("away_team_name")
    @Expose
    private String awayTeamName;
    @SerializedName("away_time")
    @Expose
    private String awayTime;
    @SerializedName("away_time_zone")
    @Expose
    private String awayTimeZone;
    @SerializedName("away_win")
    @Expose
    private String awayWin;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("double_header_sw")
    @Expose
    private String doubleHeaderSw;
    @SerializedName("first_pitch_et")
    @Expose
    private String firstPitchEt;
    @SerializedName("game_data_directory")
    @Expose
    private String gameDataDirectory;
    @SerializedName("game_nbr")
    @Expose
    private String gameNbr;
    @SerializedName("game_pk")
    @Expose
    private String gamePk;
    @SerializedName("game_type")
    @Expose
    private String gameType;
    @SerializedName("gameday")
    @Expose
    private String gameday;
    @SerializedName("gameday_sw")
    @Expose
    private String gamedaySw;
    @SerializedName("hm_lg_ampm")
    @Expose
    private String hmLgAmpm;
    @SerializedName("home_ampm")
    @Expose
    private String homeAmpm;
    @SerializedName("home_code")
    @Expose
    private String homeCode;
    @SerializedName("home_division")
    @Expose
    private String homeDivision;
    @SerializedName("home_file_code")
    @Expose
    private String homeFileCode;
    @SerializedName("home_games_back")
    @Expose
    private String homeGamesBack;
    @SerializedName("home_games_back_wildcard")
    @Expose
    private String homeGamesBackWildcard;
    @SerializedName("home_league_id")
    @Expose
    private String homeLeagueId;
    @SerializedName("home_loss")
    @Expose
    private String homeLoss;
    @SerializedName("home_name_abbrev")
    @Expose
    private String homeNameAbbrev;
    @SerializedName("home_sport_code")
    @Expose
    private String homeSportCode;
    @SerializedName("home_team_city")
    @Expose
    private String homeTeamCity;
    @SerializedName("home_team_id")
    @Expose
    private String homeTeamId;
    @SerializedName("home_team_name")
    @Expose
    private String homeTeamName;
    @SerializedName("home_time")
    @Expose
    private String homeTime;
    @SerializedName("home_time_zone")
    @Expose
    private String homeTimeZone;
    @SerializedName("home_win")
    @Expose
    private String homeWin;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("inning_break_length")
    @Expose
    private String inningBreakLength;
    @SerializedName("league")
    @Expose
    private String league;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("original_date")
    @Expose
    private String originalDate;
    @SerializedName("resume_date")
    @Expose
    private String resumeDate;
    @SerializedName("scheduled_innings")
    @Expose
    private String scheduledInnings;
    @SerializedName("tbd_flag")
    @Expose
    private String tbdFlag;
    @SerializedName("tiebreaker_sw")
    @Expose
    private String tiebreakerSw;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("time_aw_lg")
    @Expose
    private String timeAwLg;
    @SerializedName("time_date")
    @Expose
    private String timeDate;
    @SerializedName("time_date_aw_lg")
    @Expose
    private String timeDateAwLg;
    @SerializedName("time_date_hm_lg")
    @Expose
    private String timeDateHmLg;
    @SerializedName("time_hm_lg")
    @Expose
    private String timeHmLg;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("time_zone_aw_lg")
    @Expose
    private String timeZoneAwLg;
    @SerializedName("time_zone_hm_lg")
    @Expose
    private String timeZoneHmLg;
    @SerializedName("tz_aw_lg_gen")
    @Expose
    private String tzAwLgGen;
    @SerializedName("tz_hm_lg_gen")
    @Expose
    private String tzHmLgGen;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("venue_id")
    @Expose
    private String venueId;
    @SerializedName("venue_w_chan_loc")
    @Expose
    private String venueWChanLoc;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public HomeRuns getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(HomeRuns homeRuns) {
        this.homeRuns = homeRuns;
    }

    public Linescore getLinescore() {
        return linescore;
    }

    public void setLinescore(Linescore linescore) {
        this.linescore = linescore;
    }

    public WinningPitcher getWinningPitcher() {
        return winningPitcher;
    }

    public void setWinningPitcher(WinningPitcher winningPitcher) {
        this.winningPitcher = winningPitcher;
    }

    public LosingPitcher getLosingPitcher() {
        return losingPitcher;
    }

    public void setLosingPitcher(LosingPitcher losingPitcher) {
        this.losingPitcher = losingPitcher;
    }

    public SavePitcher getSavePitcher() {
        return savePitcher;
    }

    public void setSavePitcher(SavePitcher savePitcher) {
        this.savePitcher = savePitcher;
    }

    public String getVideoThumbnail() {
        return videoThumbnail;
    }

    public void setVideoThumbnail(String videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }

    public VideoThumbnails getVideoThumbnails() {
        return videoThumbnails;
    }

    public void setVideoThumbnails(VideoThumbnails videoThumbnails) {
        this.videoThumbnails = videoThumbnails;
    }

    public GameMedia getGameMedia() {
        return gameMedia;
    }

    public void setGameMedia(GameMedia gameMedia) {
        this.gameMedia = gameMedia;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getAwLgAmpm() {
        return awLgAmpm;
    }

    public void setAwLgAmpm(String awLgAmpm) {
        this.awLgAmpm = awLgAmpm;
    }

    public String getAwayAmpm() {
        return awayAmpm;
    }

    public void setAwayAmpm(String awayAmpm) {
        this.awayAmpm = awayAmpm;
    }

    public String getAwayCode() {
        return awayCode;
    }

    public void setAwayCode(String awayCode) {
        this.awayCode = awayCode;
    }

    public String getAwayDivision() {
        return awayDivision;
    }

    public void setAwayDivision(String awayDivision) {
        this.awayDivision = awayDivision;
    }

    public String getAwayFileCode() {
        return awayFileCode;
    }

    public void setAwayFileCode(String awayFileCode) {
        this.awayFileCode = awayFileCode;
    }

    public String getAwayGamesBack() {
        return awayGamesBack;
    }

    public void setAwayGamesBack(String awayGamesBack) {
        this.awayGamesBack = awayGamesBack;
    }

    public String getAwayGamesBackWildcard() {
        return awayGamesBackWildcard;
    }

    public void setAwayGamesBackWildcard(String awayGamesBackWildcard) {
        this.awayGamesBackWildcard = awayGamesBackWildcard;
    }

    public String getAwayLeagueId() {
        return awayLeagueId;
    }

    public void setAwayLeagueId(String awayLeagueId) {
        this.awayLeagueId = awayLeagueId;
    }

    public String getAwayLoss() {
        return awayLoss;
    }

    public void setAwayLoss(String awayLoss) {
        this.awayLoss = awayLoss;
    }

    public String getAwayNameAbbrev() {
        return awayNameAbbrev;
    }

    public void setAwayNameAbbrev(String awayNameAbbrev) {
        this.awayNameAbbrev = awayNameAbbrev;
    }

    public String getAwaySportCode() {
        return awaySportCode;
    }

    public void setAwaySportCode(String awaySportCode) {
        this.awaySportCode = awaySportCode;
    }

    public String getAwayTeamCity() {
        return awayTeamCity;
    }

    public void setAwayTeamCity(String awayTeamCity) {
        this.awayTeamCity = awayTeamCity;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTime() {
        return awayTime;
    }

    public void setAwayTime(String awayTime) {
        this.awayTime = awayTime;
    }

    public String getAwayTimeZone() {
        return awayTimeZone;
    }

    public void setAwayTimeZone(String awayTimeZone) {
        this.awayTimeZone = awayTimeZone;
    }

    public String getAwayWin() {
        return awayWin;
    }

    public void setAwayWin(String awayWin) {
        this.awayWin = awayWin;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDoubleHeaderSw() {
        return doubleHeaderSw;
    }

    public void setDoubleHeaderSw(String doubleHeaderSw) {
        this.doubleHeaderSw = doubleHeaderSw;
    }

    public String getFirstPitchEt() {
        return firstPitchEt;
    }

    public void setFirstPitchEt(String firstPitchEt) {
        this.firstPitchEt = firstPitchEt;
    }

    public String getGameDataDirectory() {
        return gameDataDirectory;
    }

    public void setGameDataDirectory(String gameDataDirectory) {
        this.gameDataDirectory = gameDataDirectory;
    }

    public String getGameNbr() {
        return gameNbr;
    }

    public void setGameNbr(String gameNbr) {
        this.gameNbr = gameNbr;
    }

    public String getGamePk() {
        return gamePk;
    }

    public void setGamePk(String gamePk) {
        this.gamePk = gamePk;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameday() {
        return gameday;
    }

    public void setGameday(String gameday) {
        this.gameday = gameday;
    }

    public String getGamedaySw() {
        return gamedaySw;
    }

    public void setGamedaySw(String gamedaySw) {
        this.gamedaySw = gamedaySw;
    }

    public String getHmLgAmpm() {
        return hmLgAmpm;
    }

    public void setHmLgAmpm(String hmLgAmpm) {
        this.hmLgAmpm = hmLgAmpm;
    }

    public String getHomeAmpm() {
        return homeAmpm;
    }

    public void setHomeAmpm(String homeAmpm) {
        this.homeAmpm = homeAmpm;
    }

    public String getHomeCode() {
        return homeCode;
    }

    public void setHomeCode(String homeCode) {
        this.homeCode = homeCode;
    }

    public String getHomeDivision() {
        return homeDivision;
    }

    public void setHomeDivision(String homeDivision) {
        this.homeDivision = homeDivision;
    }

    public String getHomeFileCode() {
        return homeFileCode;
    }

    public void setHomeFileCode(String homeFileCode) {
        this.homeFileCode = homeFileCode;
    }

    public String getHomeGamesBack() {
        return homeGamesBack;
    }

    public void setHomeGamesBack(String homeGamesBack) {
        this.homeGamesBack = homeGamesBack;
    }

    public String getHomeGamesBackWildcard() {
        return homeGamesBackWildcard;
    }

    public void setHomeGamesBackWildcard(String homeGamesBackWildcard) {
        this.homeGamesBackWildcard = homeGamesBackWildcard;
    }

    public String getHomeLeagueId() {
        return homeLeagueId;
    }

    public void setHomeLeagueId(String homeLeagueId) {
        this.homeLeagueId = homeLeagueId;
    }

    public String getHomeLoss() {
        return homeLoss;
    }

    public void setHomeLoss(String homeLoss) {
        this.homeLoss = homeLoss;
    }

    public String getHomeNameAbbrev() {
        return homeNameAbbrev;
    }

    public void setHomeNameAbbrev(String homeNameAbbrev) {
        this.homeNameAbbrev = homeNameAbbrev;
    }

    public String getHomeSportCode() {
        return homeSportCode;
    }

    public void setHomeSportCode(String homeSportCode) {
        this.homeSportCode = homeSportCode;
    }

    public String getHomeTeamCity() {
        return homeTeamCity;
    }

    public void setHomeTeamCity(String homeTeamCity) {
        this.homeTeamCity = homeTeamCity;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTime() {
        return homeTime;
    }

    public void setHomeTime(String homeTime) {
        this.homeTime = homeTime;
    }

    public String getHomeTimeZone() {
        return homeTimeZone;
    }

    public void setHomeTimeZone(String homeTimeZone) {
        this.homeTimeZone = homeTimeZone;
    }

    public String getHomeWin() {
        return homeWin;
    }

    public void setHomeWin(String homeWin) {
        this.homeWin = homeWin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInningBreakLength() {
        return inningBreakLength;
    }

    public void setInningBreakLength(String inningBreakLength) {
        this.inningBreakLength = inningBreakLength;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(String originalDate) {
        this.originalDate = originalDate;
    }

    public String getResumeDate() {
        return resumeDate;
    }

    public void setResumeDate(String resumeDate) {
        this.resumeDate = resumeDate;
    }

    public String getScheduledInnings() {
        return scheduledInnings;
    }

    public void setScheduledInnings(String scheduledInnings) {
        this.scheduledInnings = scheduledInnings;
    }

    public String getTbdFlag() {
        return tbdFlag;
    }

    public void setTbdFlag(String tbdFlag) {
        this.tbdFlag = tbdFlag;
    }

    public String getTiebreakerSw() {
        return tiebreakerSw;
    }

    public void setTiebreakerSw(String tiebreakerSw) {
        this.tiebreakerSw = tiebreakerSw;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeAwLg() {
        return timeAwLg;
    }

    public void setTimeAwLg(String timeAwLg) {
        this.timeAwLg = timeAwLg;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
    }

    public String getTimeDateAwLg() {
        return timeDateAwLg;
    }

    public void setTimeDateAwLg(String timeDateAwLg) {
        this.timeDateAwLg = timeDateAwLg;
    }

    public String getTimeDateHmLg() {
        return timeDateHmLg;
    }

    public void setTimeDateHmLg(String timeDateHmLg) {
        this.timeDateHmLg = timeDateHmLg;
    }

    public String getTimeHmLg() {
        return timeHmLg;
    }

    public void setTimeHmLg(String timeHmLg) {
        this.timeHmLg = timeHmLg;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTimeZoneAwLg() {
        return timeZoneAwLg;
    }

    public void setTimeZoneAwLg(String timeZoneAwLg) {
        this.timeZoneAwLg = timeZoneAwLg;
    }

    public String getTimeZoneHmLg() {
        return timeZoneHmLg;
    }

    public void setTimeZoneHmLg(String timeZoneHmLg) {
        this.timeZoneHmLg = timeZoneHmLg;
    }

    public String getTzAwLgGen() {
        return tzAwLgGen;
    }

    public void setTzAwLgGen(String tzAwLgGen) {
        this.tzAwLgGen = tzAwLgGen;
    }

    public String getTzHmLgGen() {
        return tzHmLgGen;
    }

    public void setTzHmLgGen(String tzHmLgGen) {
        this.tzHmLgGen = tzHmLgGen;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getVenueWChanLoc() {
        return venueWChanLoc;
    }

    public void setVenueWChanLoc(String venueWChanLoc) {
        this.venueWChanLoc = venueWChanLoc;
    }

}
