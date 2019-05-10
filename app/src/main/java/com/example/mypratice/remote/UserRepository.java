package com.example.mypratice.remote;

import androidx.lifecycle.MutableLiveData;

public class UserRepository {

    private MutableLiveData<String> data = new MutableLiveData<>();

    public UserRepository(){

    }

    public void loginUser(String name){
        if(name.equals("kavin")){
            data.setValue("Login");
        }
        else{
            data.setValue("error");
        }
    }

    public MutableLiveData<String> getResponse(){


        return data;
    }


}
