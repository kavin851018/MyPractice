package com.example.mypratice.viewmodel;

import android.database.Observable;

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
        nameval.set("This is first one");
        data = userRepository.getResponse();


    }

    public MutableLiveData<String> getData(){

        return data;

    }
}
