package com.example.mypratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.mypratice.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        activityMainBinding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recyclerview.setHasFixedSize(true);
        adapter = new RecyclerAdapter(this , prepareUser());
        activityMainBinding.recyclerview.setAdapter(adapter);

    }

    private List<User> prepareUser(){

        List<User> Names = new ArrayList<>();
        Names.add(new User("kavin","kavin@gmail.com",R.drawable.ic_launcher_foreground));
        return Names;


    }
}
