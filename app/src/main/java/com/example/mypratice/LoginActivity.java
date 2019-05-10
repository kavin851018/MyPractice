package com.example.mypratice;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mypratice.databinding.ActivityLoginBinding;
import com.example.mypratice.presenter.Presenter;
import com.example.mypratice.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding activityLoginBinding;
    private LoginViewModel loginViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //setContentView(R.layout.activity_login);

        activityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        activityLoginBinding.setLoginviewmodel(loginViewModel);
        activityLoginBinding.setLifecycleOwner(this);
        loginViewModel.responseval.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                activityLoginBinding.textval.setText(s);
            }
        });

        activityLoginBinding.setPresenter(new Presenter() {
            @Override
            public void getData() {
                loginViewModel.login();
            }
        });
    }
}
