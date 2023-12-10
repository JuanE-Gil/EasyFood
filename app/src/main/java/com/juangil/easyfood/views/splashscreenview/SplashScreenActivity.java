package com.juangil.easyfood.views.splashscreenview;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.juangil.easyfood.MainActivity;
import com.juangil.easyfood.R;
import com.juangil.easyfood.databinding.ActivitySplashScreenBinding;
import com.juangil.easyfood.utils.Utils;

public class SplashScreenActivity extends AppCompatActivity {

    private ActivitySplashScreenBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Glide
                .with(this)
                .load(R.drawable.git_logo)
                .centerInside()
                .into(binding.ivSplashScreen);

        cambiarPantalla();
    }

    private void cambiarPantalla() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, new Utils().getDuracionSplashScreen());
    }
}