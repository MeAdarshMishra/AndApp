package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mppage extends AppCompatActivity {
    Button mp3, mp4, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mppage);
        mp3 = findViewById(R.id.mpmp3page);
        mp4 = findViewById(R.id.mpmp4page);
        back = findViewById(R.id.mpbackpage);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(mppage.this, AllApp.class);
                startActivity(back);
                finish();
            }
        });
        mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mp3p = new Intent(mppage.this, MediaPlayermp3.class);
                startActivity(mp3p);
                finish();
            }
        });
        mp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mp4p = new Intent(mppage.this, MediaPlayermp4.class);
                startActivity(mp4p);
                finish();
            }
        });
    }
}