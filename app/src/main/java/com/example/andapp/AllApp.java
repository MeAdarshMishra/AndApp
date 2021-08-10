package com.example.andapp;
// Developer-MeAdarshMishra
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AllApp extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b9, b10, b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_app);
        b1 = findViewById(R.id.allappbackbutton);
        b2 = findViewById(R.id.Allappaccelerometer);
        b3 = findViewById(R.id.calulatorallapp);
        b4 = findViewById(R.id.otherall);
        b5 = findViewById(R.id.databaseallapp);
        b9 = findViewById(R.id.camerapageall);
        b10 = findViewById(R.id.mppall);
        b12 = findViewById(R.id.weball);
        
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
                Intent otherp = new Intent(AllApp.this, Other.class);
                startActivity(otherp);
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
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camerapage = new Intent(AllApp.this, Camerapage.class);
                startActivity(camerapage);
                finish();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mpp = new Intent(AllApp.this, mppage.class);
                startActivity(mpp);
                finish();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(AllApp.this, Internet.class);
                startActivity(web);
                finish();
            }
        });
    }
}
