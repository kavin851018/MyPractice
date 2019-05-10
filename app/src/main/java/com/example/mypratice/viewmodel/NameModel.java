package com.example.mypratice.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NameModel extends ViewModel {

    public MutableLiveData<String> data;

    public MutableLiveData<String> getData(){

        if(data == null ){
            data = new MutableLiveData<>();
        }

        return data;

    }
}
