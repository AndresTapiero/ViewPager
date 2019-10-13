package com.example.praticetoolbar.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.praticetoolbar.R;


public class FormFragment extends Fragment {
    private Spinner opciones;

    public FormFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_form, container, false);

         //Spinner Logic
         opciones =  view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.Paises,android.R.layout.simple_spinner_dropdown_item
        );
        opciones.setAdapter(adapter);


        return view;
    }

}
