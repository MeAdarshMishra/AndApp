package com.example.andapp;


import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class TtSpeech extends AppCompatActivity {
    Button b1,b2;
    EditText e1;
    TextToSpeech t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tt_speech);
        b1=findViewById(R.id.speech);
        e1=findViewById(R.id.editToSpeech);
        b2=findViewById(R.id.backspeech);
        t=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t.setLanguage(Locale.ENGLISH);
                t.setSpeechRate(0.07f);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                t.speak(s1,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TtSpeech.this, AllApp.class);
                startActivity(i);
                finish();
            }
        });

    }
}