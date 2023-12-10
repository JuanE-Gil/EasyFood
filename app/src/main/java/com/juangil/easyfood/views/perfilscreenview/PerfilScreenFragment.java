package com.juangil.easyfood.views.perfilscreenview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juangil.easyfood.R;


public class PerfilScreenFragment extends Fragment {


    public PerfilScreenFragment() {
        // Required empty public constructor
    }


    public static PerfilScreenFragment newInstance(String param1, String param2) {
        PerfilScreenFragment fragment = new PerfilScreenFragment();

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
        return inflater.inflate(R.layout.fragment_perfil_screen, container, false);
    }
}