package com.dzartek.mlbaseballscores.network;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dzarrillo on 2/9/2018.
 */

public class BaseballRetrofit {
    private static final String BASEBALL_URL = "http://gd2.mlb.com/components/game/mlb/";

    public BaseballService getBaseballRxSingleService(){
        final Retrofit retrofit = createRetrofit();
        return retrofit.create(BaseballService.class);
    }

    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASEBALL_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
