package com.jiit.minor2.shubhamjoshi.human.modals.Twitter;

/**
 * Created by Shubham Joshi on 30-09-2016.
 */

public class TwitterData {
    private String imageUrl;
    private String tag;
    private long timeStamp;
    int selected;

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public  TwitterData(String imageUrl, String tag, long timeStamp )
    {
        this.imageUrl = imageUrl;
        this.tag = tag;
        selected = 0;
        this.timeStamp = timeStamp;


    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
