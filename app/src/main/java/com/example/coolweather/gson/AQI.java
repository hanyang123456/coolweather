package com.example.coolweather.gson;

/**
 * Created by Administrator on 2020/2/7.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
