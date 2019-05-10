package com.example.mypratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mypratice.viewmodel.CategoryViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CategoryViewModel categoryViewModel;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        categoryViewModel = ViewModelProviders.of(this).get(CategoryViewModel.class);

        categoryViewModel.getArrayListMutableLiveData().observe(this, new Observer<ArrayList<CategoryViewModel>>() {
            @Override
            public void onChanged(ArrayList<CategoryViewModel> categoryViewModels) {

            }
        });

    }
}
