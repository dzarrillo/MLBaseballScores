
package com.dzartek.mlbaseballscores.pojomodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameMedia {

    @SerializedName("media")
    @Expose
    private List<Medium> media = null;

    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

}
