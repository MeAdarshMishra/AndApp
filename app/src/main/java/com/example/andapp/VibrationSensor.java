package com.example.andapp;
// Vibration Sensor page
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VibrationSensor extends AppCompatActivity {
    Button b1,b2;
    Vibrator v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration_sensor);
        b1=findViewById(R.id.clicktovibrate);
        b2=findViewById(R.id.backvibration);
        v1= (Vibrator) getSystemService(VIBRATOR_SERVICE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>26)
                {
                    v1.vibrate(1000);
                }
                else
                {
                    v1.vibrate(1000);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VibrationSensor.this, Other.class);
                startActivity(i);
                finish();
            }
        });

    }
}
