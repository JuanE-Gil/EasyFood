package com.juangil.easyfood.views.carritoscreenview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.juangil.easyfood.databinding.ActivityCarritoScreenBinding;

public class CarritoScreenActivity extends AppCompatActivity {

    private ActivityCarritoScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarritoScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}