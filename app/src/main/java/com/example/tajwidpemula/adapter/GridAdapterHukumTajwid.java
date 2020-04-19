package com.example.tajwidpemula.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tajwidpemula.R;
import com.example.tajwidpemula.activity.SubMenuHukumTajwidActivity;

import java.util.ArrayList;
import java.util.List;

public class GridAdapterHukumTajwid extends RecyclerView.Adapter<GridAdapterHukumTajwid.ViewHolder> {
    List<GridItemHukumTajwid> mItems;

    public GridAdapterHukumTajwid() {
        super();
        mItems = new ArrayList<GridItemHukumTajwid>();
        GridItemHukumTajwid nama = new GridItemHukumTajwid();
        nama.setName("Nun Mati dan Tanwin");
        nama.setThumbnail(R.drawable.hukum_tajwid_nun_mati);
        mItems.add(nama);

        nama = new GridItemHukumTajwid();
        nama.setName("Qolqolah");
        nama.setThumbnail(R.drawable.hukum_tajwid_kolkolah);
        mItems.add(nama);

        nama = new GridItemHukumTajwid();
        nama.setName("Bacaan Lam");
        nama.setThumbnail(R.drawable.hukum_tajwid_lam);
        mItems.add(nama);

        nama = new GridItemHukumTajwid();
        nama.setName("Bacaan Ro");
        nama.setThumbnail(R.drawable.hukum_tajwid_ro);
        mItems.add(nama);

        nama = new GridItemHukumTajwid();
        nama.setName("Mim Mati");
        nama.setThumbnail(R.drawable.hukum_tajwid_mim);
        mItems.add(nama);

        nama = new GridItemHukumTajwid();
        nama.setName("Hukum Mad");
        nama.setThumbnail(R.drawable.hukum_tajwid_mad);
        mItems.add(nama);

        nama = new GridItemHukumTajwid();
        nama.setName("Hukum Ghoribah");
        nama.setThumbnail(R.drawable.hukum_tajwid_gribah);
        mItems.add(nama);

        nama = new GridItemHukumTajwid();
        nama.setName("Tanda-Tanda Waqof");
        nama.setThumbnail(R.drawable.hukum_tajwid_tanda_waqof);
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
        GridItemHukumTajwid nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumnail());

        viewHolder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah;
                if (i==0){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==1){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==2){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==3){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==4){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==5){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==6){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==7){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
                    v.getContext().startActivity(pindah);
                }else if (i==8){
                    pindah = new Intent(v.getContext(), SubMenuHukumTajwidActivity.class);
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
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_item);
            tvspecies = (TextView)itemView.findViewById(R.id.judul_item);
            card = (CardView)itemView.findViewById(R.id.card);

        }


    }
}