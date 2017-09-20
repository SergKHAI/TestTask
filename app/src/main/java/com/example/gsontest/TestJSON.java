package com.example.gsontest;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Сергей on 20.09.2017.
 */
class main
{
    String temp_min;
    String temp_max;
}
class wind
{
    String speed;
}
class City
{

    String name;
    String getCityTitle() {return name; }
}
public class TestJSON {
    private main main;
    private wind wind;


    public String getWindSpeed() {
        return wind.speed;
    }

    public String getMaxTemp() {return main.temp_max;}

    public String getMinTemp() {return main.temp_min; }


}
