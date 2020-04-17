package com.example.tapbd3.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tapbd3.activity.KuisActivity;
import com.example.tapbd3.R;
import com.example.tapbd3.adapter.GridAdapterHome;
import com.example.tapbd3.adapter.GridAdapterKuis;


/**
 * A simple {@link Fragment} subclass.
 */
public class KuisFragment extends Fragment {


    RecyclerView mRecyclerview;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    public KuisFragment() {
        // Required empty public constructor
    }

    private CardView kuis1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kuis, container, false);


        mRecyclerview = v.findViewById(R.id.recyclerview);
        mRecyclerview.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerview.setLayoutManager(mLayoutManager);

        mAdapter = new GridAdapterKuis();
        mRecyclerview.setAdapter(mAdapter);


//        kuis1 = v.findViewById(R.id.kuis1);
//        kuis1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), KuisActivity.class);
//                startActivity(intent);
//            }
//        });

        return v;

    }



}
