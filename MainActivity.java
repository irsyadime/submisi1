package com.example.myfavplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayers;
    private ArrayList<Players> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlayers=findViewById(R.id.rv_dota2);
        rvPlayers.setHasFixedSize(true);

        list.addAll(Data_Players.getData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(list,this);
        rvPlayers.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.about_me,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int SelectMenu){
        switch (SelectMenu){
            case R.id.About:
                Intent intent = new Intent(MainActivity.this,about.class);
                startActivity(intent);
                break;
        }
    }
}
