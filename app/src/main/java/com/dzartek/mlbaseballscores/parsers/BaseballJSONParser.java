package com.dzartek.mlbaseballscores.parsers;

import android.util.Log;

import com.dzartek.mlbaseballscores.model.Baseball;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzarrillo on 8/25/2015.
 */
public class BaseballJSONParser {
    private final static String TAG = "BaseballJSONParser";
    private final static String  MY_GAMES = "games";

    public static List<Baseball> parseFeed(String content){

        List<Baseball> baseballList = new ArrayList<>();

        try {

            //JSONArray ar = new JSONArray(content);

            JSONObject jobj = new JSONObject(content);
            JSONArray ar = jobj.getJSONObject("data").getJSONObject("games").getJSONArray("game");   //.get("year").toString();

            for (int i = 0; i < ar.length(); i++){
                JSONObject obj = ar.getJSONObject(i);
                Baseball baseball = new Baseball();

                baseball.setHomeTeam(obj.getString("home_team_name"));
                baseball.setHomeTeamCity(obj.getString("home_team_city"));
                baseball.setAwayTeam(obj.getString("away_team_name"));
                baseball.setAwayTeamCity(obj.getString("away_team_city"));

                // We need to drill down - Get linescore object
                JSONObject objLineScore = obj.getJSONObject("linescore");
                // Get the r object for runs
                JSONObject objR = objLineScore.getJSONObject("r");
                baseball.setHomeScore(objR.getString("home"));
                baseball.setAwayScore(objR.getString("away"));
                // Get the h object for hits
                JSONObject objH = objLineScore.getJSONObject("h");
                baseball.setHomeHits(objH.getString("home"));
                baseball.setAwayHits(objH.getString("away"));
                // Get the e object for errors
                JSONObject objE = objLineScore.getJSONObject("e");
                baseball.setHomeErrors(objE.getString("home"));
                baseball.setAwayErrors(objE.getString("away"));

                // get winning_pitcher object
                JSONObject objWPitcher = obj.getJSONObject("winning_pitcher");
                baseball.setWinningPitcher(objWPitcher.getString("first")
                        + " " + objWPitcher.getString("last"));
                baseball.setWinningWins(objWPitcher.getString("wins"));
                baseball.setWinningLosses(objWPitcher.getString("losses"));

                // get losing_pitcher object
                JSONObject objLPitcher = obj.getJSONObject("losing_pitcher");
                baseball.setLosingPitcher(objLPitcher.getString("first")
                        + " " + objLPitcher.getString("last"));
                baseball.setLosingWins(objWPitcher.getString("wins"));
                baseball.setLosingLosses(objWPitcher.getString("losses"));

                // Get the status of the game
                JSONObject objrStatus = obj.getJSONObject("status");
                baseball.setStatus(objrStatus.getString("status"));
                baseball.setInning(objrStatus.getString("inning"));
                baseball.setInning_state(objrStatus.getString("inning_state"));

                baseballList.add(baseball);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "Error: Could not get any data from the URL! " + e.getMessage());

            baseballList = null;
        }
        return baseballList;
    }
}
