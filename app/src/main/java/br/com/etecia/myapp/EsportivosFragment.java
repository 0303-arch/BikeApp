package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EsportivosFragment extends FragmentS {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View esportivos = inflater.inflate(R.layout.fragment_esportivos, container, false);
        return esportivos;
    }
}