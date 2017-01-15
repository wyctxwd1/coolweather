package com.ab.yuri.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Yuri on 2017/1/14.
 */

public class Forecast {
        public String date;
        @SerializedName("cond")
        public More more;
       @SerializedName("tmp")
        public Temperature temperature;




        public class More {
            @SerializedName("txt_d")
            public String info;

        }

        public class Temperature {
           
            public String max;

            public String min;
        }


}
