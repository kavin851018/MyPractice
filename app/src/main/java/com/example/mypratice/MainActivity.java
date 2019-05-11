package com.example.mypratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mypratice.databinding.ActivityMainBinding;
import com.example.mypratice.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);

        UserModel userModel = new UserModel();
        userModel.setEmail("kavin");
        userModel.setPassword("kavin");
        activityMainBinding.setUser(userModel);

    }
}
