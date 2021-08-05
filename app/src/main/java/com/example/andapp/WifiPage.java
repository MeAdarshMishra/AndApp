package com.example.andapp;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WifiPage extends AppCompatActivity {
    Button backwifi;
    Button on, off;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = findViewById(R.id.button);
        off = findViewById(R.id.button2);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);

        on.setOnClickListener(v -> wifiManager.setWifiEnabled(true));

        off.setOnClickListener(v -> wifiManager.setWifiEnabled(false));

        backwifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(WifiPage.this, AllApp.class);
                startActivity(back);
                finish();
            }
        });
    }
}
