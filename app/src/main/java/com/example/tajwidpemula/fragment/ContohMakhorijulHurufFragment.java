package com.example.tajwidpemula.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tajwidpemula.R;
import com.example.tajwidpemula.adapter.CustomAdapterContoh;
import com.example.tajwidpemula.adapter.CustomAdapterMakhorijulHuruf;
import com.example.tajwidpemula.adapter.GridAdapterHukumTajwid;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContohMakhorijulHurufFragment extends Fragment {

    Context context;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    String[] subjects = {
            "ونتج أعمال قد عرض", "ونتج أعمال قد عرض", "ونتج أعمال قد عرض", "ونتج أعمال قد عرض"
//            "Huruf Ja", "Huruf Ha", "Huruf Kho", "Huruf Da", "Huruf Dza",
//            "Huruf Ro", "Huruf Za", "Huruf Sa", "Huruf Sya",
//            "Huruf Sho", "Huruf Dho", "Huruf Tho", "Huruf Zho",
//            "Huruf 'A", "Huruf Gho", "Huruf Fa",
//            "Huruf Qo", "Huruf Ka", "Huruf La", "Huruf Ma",
//            "Huruf Na", "Huruf Wa", "Huruf Haa'",
//            "Huruf La", "Huruf Ya"
    };
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
        View v = inflater.inflate(R.layout.fragment_contoh_makhorijul_huruf, container, false);
        recyclerView = v.findViewById(R.id.recyclerview);
        recylerViewLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new CustomAdapterContoh(subjects);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }
}
