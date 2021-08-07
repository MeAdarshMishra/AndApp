package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Other extends AppCompatActivity {
    Button flash, blue, tt, back, vibration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        flash = findViewById(R.id.flashother);
        blue = findViewById(R.id.bluetoothother);
        vibration = findViewById(R.id.vibrationother);
        tt = findViewById(R.id.ttother);
        back = findViewById(R.id.backother);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Other.this, AllApp.class);
                startActivity(back);
                finish();
            }
        });
        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flashp = new Intent(Other.this, FlashLight.class);
                startActivity(flashp);
                finish();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bluep = new Intent(Other.this, Bluetooth.class);
                startActivity(bluep);
                finish();
            }
        });
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ttp = new Intent(Other.this, TtSpeech.class);
                startActivity(ttp);
                finish();
            }
        });
    }
}