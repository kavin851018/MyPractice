package com.example.mypratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.mypratice.databinding.ActivityMainBinding;
import com.example.mypratice.presenter.Presenter;
import com.example.mypratice.viewmodel.NameModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private NameModel nameModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        activityMainBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        nameModel = ViewModelProviders.of(this).get(NameModel.class);

        activityMainBinding.setNamemodel(nameModel);

        nameModel.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                activityMainBinding.mytext.setText(s);
            }
        });

        activityMainBinding.setPresenter(new Presenter() {
            @Override
            public void getData() {

               nameModel.login();
            }
        });
    }
}
