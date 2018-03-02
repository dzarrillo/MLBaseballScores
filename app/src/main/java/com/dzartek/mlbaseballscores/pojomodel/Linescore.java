
package com.dzartek.mlbaseballscores.pojomodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Linescore {

    @SerializedName("inning")
    @Expose
    private List<Inning> inning = null;
    @SerializedName("r")
    @Expose
    private R r;
    @SerializedName("h")
    @Expose
    private H h;
    @SerializedName("e")
    @Expose
    private E e;
    @SerializedName("hr")
    @Expose
    private Hr hr;
    @SerializedName("sb")
    @Expose
    private Sb sb;
    @SerializedName("so")
    @Expose
    private So so;

    public List<Inning> getInning() {
        return inning;
    }

    public void setInning(List<Inning> inning) {
        this.inning = inning;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public H getH() {
        return h;
    }

    public void setH(H h) {
        this.h = h;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public Hr getHr() {
        return hr;
    }

    public void setHr(Hr hr) {
        this.hr = hr;
    }

    public Sb getSb() {
        return sb;
    }

    public void setSb(Sb sb) {
        this.sb = sb;
    }

    public So getSo() {
        return so;
    }

    public void setSo(So so) {
        this.so = so;
    }

}
