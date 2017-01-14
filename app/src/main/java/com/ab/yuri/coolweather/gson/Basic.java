package com.ab.yuri.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yuri on 2017/1/14.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    private class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}