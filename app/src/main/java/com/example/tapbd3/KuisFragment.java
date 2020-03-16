package com.example.tapbd3;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.example.tapbd3.R.id.kuis1;


/**
 * A simple {@link Fragment} subclass.
 */
public class KuisFragment extends Fragment {


    public KuisFragment() {
        // Required empty public constructor
    }

    private CardView kuis1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kuis, container, false);


        kuis1 = v.findViewById(R.id.kuis1);
        kuis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisActivity.class);
                startActivity(intent);
            }
        });

        return v;

    }



}
