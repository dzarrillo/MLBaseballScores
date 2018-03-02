
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Home {

    @SerializedName("tv")
    @Expose
    private String tv;
    @SerializedName("radio")
    @Expose
    private String radio;

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

}
