package com.example.mypratice.remote;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginRepository {

    private MutableLiveData<String> data = new MutableLiveData<>();
    public LoginRepository(){

    }

    public MutableLiveData<String> getData(String username , String userpass){

        APIService apiService = RetroClass.getApiService();
        Call<String> usercall = apiService.userlogin(username,userpass);
        usercall.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

        return data;
    }


}
