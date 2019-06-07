package com.example.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<Pokemon> listPokemon;
    private ArrayList<Pokemon> getListPokemon() {
        return listPokemon;
    }
    public void setListPokemon(ArrayList<Pokemon> listPokemon) {
        this.listPokemon = listPokemon;
    }
    public CardViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_president, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        Pokemon p = getListPokemon().get(i);
        Glide.with(context)
                .load(p.getThumbnail())
                .apply(new RequestOptions().override(350, 350))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvAtt.setText(p.getAttack());
        cardViewViewHolder.tvDef.setText(p.getDef());
    }

    @Override
    public int getItemCount() {
        return getListPokemon().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvAtt, tvDef;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.item_name);
            tvAtt = itemView.findViewById(R.id.item_att);
            tvDef = itemView.findViewById(R.id.item_def);
        }
    }
}