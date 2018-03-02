
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseballScores {

    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("data")
    @Expose
    private Data data;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
