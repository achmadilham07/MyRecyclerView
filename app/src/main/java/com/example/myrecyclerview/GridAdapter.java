package com.example.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Pokemon> listPokemon;

    private ArrayList<Pokemon> getListPokemon() {
        return listPokemon;
    }

    public void setListPokemon(ArrayList<Pokemon> listPokemon) {
        this.listPokemon = listPokemon;
    }

    public GridAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_president, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListPokemon().get(position).getImage())
                .apply(new RequestOptions().override(350, 350))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPokemon().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}