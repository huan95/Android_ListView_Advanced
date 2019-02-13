package com.example.listview_advanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPlayer;
    ArrayList<FootballPlayerActivity.FootballPlayer> arrayPlayer;
    FootballAdapterActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listPlayer();

        adapter = new FootballAdapterActivity(this, R.layout.activity_football, arrayPlayer);
        lvPlayer.setAdapter(adapter);
    }

    private void listPlayer(){
        lvPlayer = (ListView) findViewById(R.id.listViewFootballPlayer);
        arrayPlayer = new ArrayList<>();

        arrayPlayer.add(new FootballPlayerActivity.FootballPlayer("Sanchez", "Tien Dao", R.drawable.img1_1));
        arrayPlayer.add(new FootballPlayerActivity.FootballPlayer("Messi", "Tien Dao", R.drawable.img1_2));
        arrayPlayer.add(new FootballPlayerActivity.FootballPlayer("Ronaldo", "Tien Dao", R.drawable.img1_3));
        arrayPlayer.add(new FootballPlayerActivity.FootballPlayer("Vu Van Thanh", "Hau Ve", R.drawable.img1_4));
    }
}
