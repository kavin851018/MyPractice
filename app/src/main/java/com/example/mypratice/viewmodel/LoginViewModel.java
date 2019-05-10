package com.example.mypratice.viewmodel;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mypratice.remote.LoginRepository;

public class LoginViewModel extends ViewModel {

    public ObservableField<String> username  = new ObservableField<>("");
    public ObservableField<String> userpass = new ObservableField<>("");
    public MutableLiveData<String> responseval;

    private LoginRepository loginRepository;

    public LoginViewModel(){
        loginRepository = new LoginRepository();
        username.set("kavin");
        username.set("kavin");

        responseval = loginRepository.getData(username.get() , userpass.get());
    }

    public void login(){

        responseval = loginRepository.getData(username.get(),userpass.get());
    }

    public MutableLiveData<String> getResponseval(){
        return responseval;
    }

}
