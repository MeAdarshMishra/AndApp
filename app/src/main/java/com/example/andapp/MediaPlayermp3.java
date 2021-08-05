package com.example.andapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MediaPlayermp3 extends AppCompatActivity {
    Button play, pause, stop, back;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_playermp3);
        play = findViewById(R.id.button140);
        pause = findViewById(R.id.button141);
        stop = findViewById(R.id.button142);
        back = findViewById(R.id.button143);
        mediaPlayer = MediaPlayer.create(this, R.raw.believer);
        play.setOnClickListener(v -> mediaPlayer.start());
        pause.setOnClickListener(v -> mediaPlayer.pause());
        stop.setOnClickListener(v -> mediaPlayer.stop());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(MediaPlayermp3.this, AllApp.class);
                startActivity(back);
                finish();
            }
        });
    }
}