package com.dzartek.mlbaseballscores.network;

import com.dzartek.mlbaseballscores.pojomodel.BaseballScores;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by dzarrillo on 2/9/2018.
 */

public interface BaseballService {
    //http://gd2.mlb.com/components/game/mlb/year_2017/month_08/day_12/master_scoreboard.json
    @GET("year_2017/month_08/day_12/master_scoreboard.json")
    Single<BaseballScores> getBaseballScores();
}
