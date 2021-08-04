package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView3);
        b1=findViewById(R.id.texttospeeech);

        b3=findViewById(R.id.wifibutton);
        b4=findViewById(R.id.accelerometerbutton);
        b5 = findViewById(R.id.MP4);
        b6 = findViewById(R.id.bluetooth);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent offline = new Intent(MainActivity.this, OfflineLogin.class);
                startActivity(offline);
                finish();
            }
        });
    }
}