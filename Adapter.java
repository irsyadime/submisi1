package com.example.myfavplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.text.CollationElementIterator;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ListViewHolder> {
    private ArrayList<Players> listplayer;
    private Context c;

    public Adapter(ArrayList<Players> listplayer,Context c) {
        this.listplayer = listplayer;
        this.c = c;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_player_row,viewGroup,false);
        return new ListViewHolder(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Players players = listplayer.get(position);

        Glide.with(holder.itemView.getContext())
             .load(players.getPhoto())
             .apply(new RequestOptions().override(55,55))
             .into(holder.imgPhoto);
        holder.Nametv.setText(players.getName());
        holder.tvdetail.setText(players.getDetail());
        holder.button.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent intent = new Intent(c,Detail.class);
                                                 intent.putExtra("kirim",  listplayer.get(position));
                                                 c.startActivity(intent);
                                             }
                                         }
        );
    }


    @Override
    public int getItemCount() {
        return listplayer.size();
    }



    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;
        public TextView tvdetail, Nametv;
        public Button button;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.photo);
            tvdetail = itemView.findViewById(R.id.tv_detail);
            Nametv   = itemView.findViewById(R.id.Name);
            button = itemView.findViewById(R.id.btn_detail);
        }
    }
}
