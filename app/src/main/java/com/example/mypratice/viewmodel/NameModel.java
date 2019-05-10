package com.example.mypratice.viewmodel;

import android.database.Observable;
import android.util.Log;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mypratice.remote.UserRepository;

public class NameModel extends ViewModel {

    public MutableLiveData<String> data;
    private UserRepository userRepository;
    public ObservableField<String> nameval = new ObservableField<>("");




    public NameModel(){
        userRepository = new UserRepository();
        //nameval.set("This is first one");
        userRepository.loginUser("kavin");
        data = userRepository.getResponse();


    }

    public void login(){
        userRepository.loginUser("lucy");
        data = userRepository.getResponse();
        Log.d("loginval"," "+data.getValue());

    }

    public MutableLiveData<String> getData(){

        return data;

    }
}
