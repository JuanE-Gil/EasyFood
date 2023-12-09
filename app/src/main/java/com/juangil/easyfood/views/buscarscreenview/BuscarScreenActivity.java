package com.juangil.easyfood.views.buscarscreenview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.juangil.easyfood.databinding.ActivityBuscarScreenBinding;

public class BuscarScreenActivity extends AppCompatActivity {

    private ActivityBuscarScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBuscarScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}