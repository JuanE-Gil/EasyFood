package com.juangil.easyfood.views.homescreenview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.juangil.easyfood.databinding.ActivityHomeScreenBinding;

public class HomeScreenActivity extends AppCompatActivity {

    private ActivityHomeScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}