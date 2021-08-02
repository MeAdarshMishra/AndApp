package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccelerometerSensor extends AppCompatActivity {
    Button bluetooth, flash, wifi, backsensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_sensor);
        bluetooth = findViewById(R.id.abluetooth);
        flash = findViewById(R.id.aflash);
        wifi = findViewById(R.id.awifi);
        backsensor = findViewById(R.id.sensorback);
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(AccelerometerSensor.this, AccelerometerBluetooth.class);
                startActivity(b);
                finish();
            }
        });
        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(AccelerometerSensor.this, AccelerometerFlash.class);
                startActivity(f);
                finish();
            }
        });
        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(AccelerometerSensor.this, AccelerometerWifi.class);
                startActivity(w);
                finish();
            }
        });
        backsensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(AccelerometerSensor.this, MainActivity.class);
                startActivity(s);
                finish();
            }
        });
    }
}