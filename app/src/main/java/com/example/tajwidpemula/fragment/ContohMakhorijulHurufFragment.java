package com.example.tajwidpemula.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tajwidpemula.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContohMakhorijulHurufFragment extends Fragment {

    public ContohMakhorijulHurufFragment() {
        // Required empty public constructor
    }

    public static ContohMakhorijulHurufFragment newInstance() {

        Bundle args = new Bundle();

        ContohMakhorijulHurufFragment fragment = new ContohMakhorijulHurufFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contoh_makhorijul_huruf, container, false);
    }
}
