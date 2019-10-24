package com.example.myfavplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class Detail extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    ImageView imageView;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.photo);
        textView1 = findViewById(R.id.Name);
        textView2 = findViewById(R.id.show_detail);

        Players players = getIntent().getParcelableExtra("kirim");

        textView1.setText(players.getName());
        textView2.setText(players.getDetail());
        Picasso.with(this).load(players.getPhoto()).into(imageView);

    }
}
