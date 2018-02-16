
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("games")
    @Expose
    private Games games;

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

}
