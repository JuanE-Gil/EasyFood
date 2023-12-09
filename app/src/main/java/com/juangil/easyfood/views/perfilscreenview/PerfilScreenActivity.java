package com.juangil.easyfood.views.perfilscreenview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.juangil.easyfood.databinding.ActivityPerfilScreenBinding;

public class PerfilScreenActivity extends AppCompatActivity {

    private ActivityPerfilScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPerfilScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}