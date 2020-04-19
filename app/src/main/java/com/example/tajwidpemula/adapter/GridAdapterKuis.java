package com.example.tajwidpemula.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tajwidpemula.R;

import java.util.ArrayList;
import java.util.List;

public class GridAdapterKuis extends RecyclerView.Adapter<GridAdapterKuis.ViewHolder> {
    List<GridItemKuis> mItems;

    public GridAdapterKuis() {
        super();
        mItems = new ArrayList<GridItemKuis>();
        GridItemKuis nama = new GridItemKuis();
        nama.setName("Kuis 1");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 2");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 3");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 4");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 5");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 6");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 7");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 8");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 9");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 10");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 11");
        nama.setThumbnail(R.drawable.kuis_success);
        mItems.add(nama);

        nama = new GridItemKuis();
        nama.setName("Kuis 12");
        nama.setThumbnail(R.drawable.kuis_success);
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
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        GridItemKuis nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_item);
            tvspecies = (TextView)itemView.findViewById(R.id.judul_item);

        }
    }
}
