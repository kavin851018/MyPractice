package com.example.mypratice.remote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/coupens/read.php")
    Call<CategoryList> getCategoryList();

}
