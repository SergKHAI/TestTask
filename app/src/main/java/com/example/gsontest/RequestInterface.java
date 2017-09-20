package com.example.gsontest;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("data/2.5/forecast?id=city/706483&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<JSONResponse> getJSON();
}
