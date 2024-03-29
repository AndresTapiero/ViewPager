package com.example.praticetoolbar.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.praticetoolbar.Interfaces.cambiarFragment;
import com.example.praticetoolbar.R;


public class FormFragment extends Fragment {
    View view;
    private Spinner SpinnerCountrys;
    private Button button;
    private EditText editTextName;
    public static ViewPager mViewPager;
    cambiarFragment EM;

    public FormFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_form, container, false);

        //Spinner Logic
        SpinnerCountrys = view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.Paises, android.R.layout.simple_spinner_dropdown_item
        );
        SpinnerCountrys.setAdapter(adapter);
        editTextName = view.findViewById(R.id.editTextNamePerson);
        button = view.findViewById(R.id.createPerson);
       // strUsername = editTextName.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editTextName.getText().toString();
                EM.cambiar(name);


               // cambiarFragment()
                //mViewPager.setCurrentItem(PagerAdapter.);
/*                Log.d("Andres","Si estoy haciendo Clic");
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.firstFragment, new ListFragment());
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();*/


            }
        });
        return view;
    }

    public void onAttach(Context context) {

        super.onAttach(context);

        EM = (cambiarFragment) context;
    }




}