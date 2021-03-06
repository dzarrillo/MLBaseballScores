
package com.dzartek.mlbaseballscores.pojomodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Medium {

    @SerializedName("calendar_event_id")
    @Expose
    private String calendarEventId;
    @SerializedName("enhanced")
    @Expose
    private String enhanced;
    @SerializedName("free")
    @Expose
    private String free;
    @SerializedName("has_milbtv")
    @Expose
    private String hasMilbtv;
    @SerializedName("has_mlbtv")
    @Expose
    private String hasMlbtv;
    @SerializedName("media_state")
    @Expose
    private String mediaState;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("content_id")
    @Expose
    private String contentId;
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("topic_id")
    @Expose
    private String topicId;

    public String getCalendarEventId() {
        return calendarEventId;
    }

    public void setCalendarEventId(String calendarEventId) {
        this.calendarEventId = calendarEventId;
    }

    public String getEnhanced() {
        return enhanced;
    }

    public void setEnhanced(String enhanced) {
        this.enhanced = enhanced;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getHasMilbtv() {
        return hasMilbtv;
    }

    public void setHasMilbtv(String hasMilbtv) {
        this.hasMilbtv = hasMilbtv;
    }

    public String getHasMlbtv() {
        return hasMlbtv;
    }

    public void setHasMlbtv(String hasMlbtv) {
        this.hasMlbtv = hasMlbtv;
    }

    public String getMediaState() {
        return mediaState;
    }

    public void setMediaState(String mediaState) {
        this.mediaState = mediaState;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

}
