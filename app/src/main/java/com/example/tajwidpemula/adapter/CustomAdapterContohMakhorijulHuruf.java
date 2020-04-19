package com.example.tajwidpemula.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tajwidpemula.R;

public class CustomAdapterContohMakhorijulHuruf extends RecyclerView.Adapter<CustomAdapterContohMakhorijulHuruf.ViewHolder> {

    private String[] SubjectValues;
    private Context context;

    public CustomAdapterContohMakhorijulHuruf(String[] SubjectValues1) {

        SubjectValues = SubjectValues1;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        FrameLayout cardView;

        ViewHolder(View v) {

            super(v);

            textView = v.findViewById(R.id.judul);
            cardView = v.findViewById(R.id.card);
        }
    }

    @NonNull
    @Override
    public CustomAdapterContohMakhorijulHuruf.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_contoh, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.textView.setText(SubjectValues[position]);
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent pindah;
//                if (position==0){
//                    pindah = new Intent(v.getContext(), MakhorijulHurufActivity.class);
//                    v.getContext().startActivity(pindah);
//                }
//            }
//        });
    }

    @Override
    public int getItemCount() {

        return SubjectValues.length;
    }
}
