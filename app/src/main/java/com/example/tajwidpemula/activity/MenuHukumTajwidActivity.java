package com.example.tajwidpemula.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.tajwidpemula.R;
import com.example.tajwidpemula.adapter.GridAdapterHukumTajwid;

public class MenuHukumTajwidActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView mRecyclerview;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hukum_tajwid);

        mRecyclerview = findViewById(R.id.recyclerview);
        mRecyclerview.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerview.setLayoutManager(mLayoutManager);

        mAdapter = new GridAdapterHukumTajwid();
        mRecyclerview.setAdapter(mAdapter);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
