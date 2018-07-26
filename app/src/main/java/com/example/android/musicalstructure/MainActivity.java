package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Gal in kadni","Parmish Verma"));
        songs.add(new Song("Tum hi ho","Arjit Singh"));
        songs.add(new Song("Daang","Mankrit Aulukh"));
        songs.add(new Song("Kuch is tarah","Atif Aslam"));
        songs.add(new Song("Kaun tujhe","Arjit Singh"));
        songs.add(new Song("Raat kamal ","Guru Randhawa"));
        songs.add(new Song("Tere sang yaara","Neha Kakkar"));
        songs.add(new Song("Thoda sa pyar hua h","Alka Yagnik"));
        songs.add(new Song("Rabb vargi maa","Happy Raikoti"));
        songs.add(new Song("Jaan","Happy Raikoti"));
        songs.add(new Song("Ladein","Jassi Gill"));
        songs.add(new Song("Guitar","Jassi Gill"));

        SongAdapter adapter = new SongAdapter(this,songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(intent);
            }
        });
    }
}
