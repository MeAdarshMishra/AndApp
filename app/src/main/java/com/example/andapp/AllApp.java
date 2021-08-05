package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AllApp extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_app);
        b1 = findViewById(R.id.allappbackbutton);
        b2 = findViewById(R.id.Allappaccelerometer);
        b3 = findViewById(R.id.calulatorallapp);
        b4 = findViewById(R.id.Bluetoothallapp);
        b5 = findViewById(R.id.databaseallapp);
        b6 = findViewById(R.id.Flashallapp);
        b7 = findViewById(R.id.ttspeechall);
        b8 = findViewById(R.id.vibrationall);
        b9 = findViewById(R.id.wifiall);
        b10 = findViewById(R.id.mp3all);
        b11 = findViewById(R.id.mp4all);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllApp.this, OnlineLogin.class);
                startActivity(intent);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accelerometer = new Intent(AllApp.this, AccelerometerSensor.class);
                startActivity(accelerometer);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculator = new Intent(AllApp.this, Calculator.class);
                startActivity(calculator);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bluetooth = new Intent(AllApp.this, Bluetooth.class);
                startActivity(bluetooth);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent database = new Intent(AllApp.this, DatabasePage.class);
                startActivity(database);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flashlight = new Intent(AllApp.this, FlashLight.class);
                startActivity(flashlight);
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ttspeech = new Intent(AllApp.this, TtSpeech.class);
                startActivity(ttspeech);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vibration = new Intent(AllApp.this, VibrationSensor.class);
                startActivity(vibration);
                finish();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wifi = new Intent(AllApp.this, Camera.class);
                startActivity(wifi);
                finish();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mp3 = new Intent(AllApp.this, MediaPlayermp3.class);
                startActivity(mp3);
                finish();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mp4 = new Intent(AllApp.this, MediaPlayermp4.class);
                startActivity(mp4);
                finish();
            }
        });
    }
}