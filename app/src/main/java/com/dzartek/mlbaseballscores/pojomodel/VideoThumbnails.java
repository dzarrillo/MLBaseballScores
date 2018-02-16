
package com.dzartek.mlbaseballscores.pojomodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoThumbnails {

    @SerializedName("thumbnail")
    @Expose
    private List<Thumbnail> thumbnail = null;

    public List<Thumbnail> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(List<Thumbnail> thumbnail) {
        this.thumbnail = thumbnail;
    }

}
