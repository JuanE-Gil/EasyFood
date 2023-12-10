package com.juangil.easyfood.views.carritoscreenview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juangil.easyfood.R;


public class CarritoScreenFragment extends Fragment {


    public CarritoScreenFragment() {
        // Required empty public constructor
    }

    public static CarritoScreenFragment newInstance(String param1, String param2) {
        CarritoScreenFragment fragment = new CarritoScreenFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_carrito_screen, container, false);
    }
}