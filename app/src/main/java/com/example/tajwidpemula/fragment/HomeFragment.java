package com.example.tajwidpemula.fragment;


import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.example.tajwidpemula.R;
import com.example.tajwidpemula.adapter.GridAdapterHome;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView mRecyclerview;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    ImageView logo;
    Animation animlogo;
    private CardView home;
    private CardView tips;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);


//        logo = v.findViewById(R.id.logo);
//
//        //load animation
//        animlogo = AnimationUtils.loadAnimation(v.getContext(), R.anim.muncul);
//        //parsing animasi
//        logo.startAnimation(animlogo);


        mRecyclerview = v.findViewById(R.id.recyclerview);
        mRecyclerview.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerview.setLayoutManager(mLayoutManager);

        mAdapter = new GridAdapterHome();
        mRecyclerview.setAdapter(mAdapter);


//        home = v.findViewById(R.id.ttg_Tajwid);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), TentangIlmuTajwidActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        tips = v.findViewById(R.id.tip_bljr_Tajwid);
//        tips.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), TipsBelajarIlmuTajwidActivity.class);
//                startActivity(intent);
//            }
//        });
        return v;
    }

}
