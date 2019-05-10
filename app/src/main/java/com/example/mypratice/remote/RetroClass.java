package com.example.mypratice.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {

    //TODO:這邊要補上網址
    private static final String BASE_URL="http://";

    private static Retrofit getRetroInstance(){
        Gson gson = new GsonBuilder().setLenient().create();
        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
    }

    public static APIService getApiService(){
        return getRetroInstance().create(APIService.class);
    }

}
