package com.example.mypratice.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {

    //TODO: 這邊還要加網址
    private static final String BASE_URL = "htp://";

    private static Retrofit getRetroInstance(){

        //TODO:等待搞懂
        Gson gson = new GsonBuilder().setLenient().create();

        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
    }

    public static APIService getApiService(){
        return getRetroInstance().create(APIService.class);
    }
}
