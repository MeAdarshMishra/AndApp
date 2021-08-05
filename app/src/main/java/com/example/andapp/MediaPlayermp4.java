package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MediaPlayermp4 extends AppCompatActivity {
    Button play, stop, back;
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_playermp4);
        play = findViewById(R.id.playmp4);
        stop = findViewById(R.id.stopmp4);
        back = findViewById(R.id.backmp4);
        videoView = findViewById(R.id.videoViewmp4);
        mediaController = new MediaController(this);
        play.setOnClickListener(v -> {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.onmywayv);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            videoView.start();
        });

        stop.setOnClickListener(v -> videoView.stopPlayback());

        back.setOnClickListener(v -> {
            Intent intent = new Intent(MediaPlayermp4.this, AllApp.class);
            startActivity(intent);
            finish();
        });
    }
}