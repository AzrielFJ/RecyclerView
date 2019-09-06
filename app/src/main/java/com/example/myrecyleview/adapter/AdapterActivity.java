package com.example.myrecyleview.adapter;

import android.app.Activity;
import android.app.VoiceInteractor;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myrecyleview.DetailTempatUmum;
import com.example.myrecyleview.ListTempatUmum;
import com.example.myrecyleview.R;
import com.example.myrecyleview.model.TempatUmum;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.ListViewHolder> {
    Context mContext;
    private ArrayList<TempatUmum> listTempat;

    public AdapterActivity(ArrayList<TempatUmum>list){
        this.listTempat=list;
    }


    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tempat_umum,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, final int position) {
            final TempatUmum tempat=listTempat.get(position);

            Glide.with(holder.itemView.getContext())
                .load(tempat.getFoto())
                .apply(new RequestOptions().override(125,125))
                .into(holder.imgGambar);
holder.namaTempat.setText(tempat.getNama());
holder.detail.setText(tempat.getDetail());

    }




    @Override
    public int getItemCount() {
        return listTempat.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout parentLayout;
        ImageView imgGambar;
        TextView namaTempat;
        TextView detail;

        public ListViewHolder( View itemView) {
            super(itemView);
            parentLayout=itemView.findViewById(R.id.activity_main);
            detail=itemView.findViewById(R.id.detail);
            namaTempat=itemView.findViewById(R.id.nama);
            imgGambar=itemView.findViewById(R.id.foto);
        }
    }
}
