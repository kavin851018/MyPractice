package com.example.mypratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView studentsRV;

    List<StudentsViewModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentsRV = findViewById(R.id.studentsRV);
        studentsRV.setLayoutManager(new LinearLayoutManager(this));

        StudentsViewModel studentsViewModel = new StudentsViewModel();
        studentsViewModel.name="Raza";
        studentsViewModel.email="kavin@gmail.com";
        data.add(studentsViewModel);

        StudentAdapter studentAdapter = new StudentAdapter(data , MainActivity.this);
        studentsRV.setAdapter(studentAdapter);

    }
}
