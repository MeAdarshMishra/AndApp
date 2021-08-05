package com.example.andapp;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WifiPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button wifion,wifioff,backwifi;
        WifiManager wifiManager;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_page);
        wifion=findViewById(R.id.wifiOnButton);
        wifioff=findViewById(R.id.wifiOffButton);
        backwifi=findViewById(R.id.backwifi);
        wifiManager=(WifiManager) getApplicationContext().getApplicationContext().getSystemService(WIFI_SERVICE);
        wifion.setOnClickListener(v -> wifiManager.setWifiEnabled(true));
        wifioff.setOnClickListener(v -> wifiManager.setWifiEnabled(false));
        backwifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WifiPage.this, AllApp.class);
                startActivity(i);
                finish();
            }
        });
    }

}