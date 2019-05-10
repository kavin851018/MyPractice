package com.example.mypratice.remote;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @FormUrlEncoded
    @POST("/loginview/logintab.php")
    Call<String> userlogin(@Field("username") String username , @Field("userpass") String userpass);


}
