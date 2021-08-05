package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AllApp extends AppCompatActivity {
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_app);
        b1 = findViewById(R.id.allappbackbutton);
        b2 = findViewById(R.id.Allappaccelerometer);
        b3 = findViewById(R.id.calulatorallapp);
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
    }
}