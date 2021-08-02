package com.example.andapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView3);
        b1=findViewById(R.id.texttospeeech);
        b2=findViewById(R.id.vibrationbutton);
        b3=findViewById(R.id.wifibutton);
        b4=findViewById(R.id.accelerometerbutton);
        b5=findViewById(R.id.MP4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ttt=new Intent(MainActivity.this, TtSpeech.class);
                startActivity(ttt);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vibration=new Intent(MainActivity.this,VibrationSensor.class);
                startActivity(vibration);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wifi=new Intent(MainActivity.this,WifiPage.class);
                startActivity(wifi);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accelerometer=new Intent(MainActivity.this,AccelerometerSensor.class);
                startActivity(accelerometer);
                finish();
                //INcomplete work
            }
        });

    }
}