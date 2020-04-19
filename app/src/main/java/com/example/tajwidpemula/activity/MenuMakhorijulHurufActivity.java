package com.example.tajwidpemula.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.example.tajwidpemula.R;
import com.example.tajwidpemula.adapter.CustomAdapterMakhorijulHuruf;

public class MenuMakhorijulHurufActivity extends AppCompatActivity {

    Toolbar toolbar;
    Context context;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    String[] subjects = {
            "Huruf Alif", "Huruf Ba", "Huruf Ta", "Huruf Tsa",
            "Huruf Ja", "Huruf Ha", "Huruf Kho", "Huruf Da", "Huruf Dza",
            "Huruf Ro", "Huruf Za", "Huruf Sa", "Huruf Sya",
            "Huruf Sho", "Huruf Dho", "Huruf Tho", "Huruf Zho",
            "Huruf 'A", "Huruf Gho", "Huruf Fa",
            "Huruf Qo", "Huruf Ka", "Huruf La", "Huruf Ma",
            "Huruf Na", "Huruf Wa", "Huruf Haa'",
            "Huruf La", "Huruf Ya"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makhorijul_huruf);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        context = getApplicationContext();
        recyclerView = findViewById(R.id.recyclerview);
        recylerViewLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new CustomAdapterMakhorijulHuruf(subjects);
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}
