package com.example.tapbd3.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tapbd3.R;
import com.example.tapbd3.activity.TentangIlmuTajwidActivity;
import com.example.tapbd3.activity.TipsBelajarIlmuTajwidActivity;

import java.util.ArrayList;
import java.util.List;

public class GridAdapterHome extends RecyclerView.Adapter<GridAdapterHome.ViewHolder> {
    List<GridItemHome> mItems;

    public GridAdapterHome() {
        super();
        mItems = new ArrayList<GridItemHome>();
        GridItemHome nama = new GridItemHome();
        nama.setName("Tentang Ilmu Tajwid");
        nama.setThumbnail(R.drawable.home_about);
        mItems.add(nama);

        nama = new GridItemHome();
        nama.setName("Tip Belajar Ilmu Tajwid");
        nama.setThumbnail(R.drawable.home_tips);
        mItems.add(nama);

        nama = new GridItemHome();
        nama.setName("Makhorijul Huruf");
        nama.setThumbnail(R.drawable.home_makhroj_huruf);
        mItems.add(nama);

        nama = new GridItemHome();
        nama.setName("Hukum Tajwid");
        nama.setThumbnail(R.drawable.home_tajwid);
        mItems.add(nama);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        GridItemHome nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumnail());

        viewHolder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah;
                if (i==0){
                    pindah = new Intent(v.getContext(), TentangIlmuTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==1){
                    pindah = new Intent(v.getContext(), TipsBelajarIlmuTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }
            }
        });


    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;
        public CardView card;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_item_home);
            tvspecies = (TextView)itemView.findViewById(R.id.judul_item_home);
            card = (CardView)itemView.findViewById(R.id.card);

        }


    }
}
