package com.example.andapp;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WifiPage extends AppCompatActivity {
    Button backwifi;
    ImageButton imageButton;
    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
    private boolean wifiState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_page);
        backwifi = findViewById(R.id.backwifi);
        imageButton = findViewById(R.id.imagewifi);
        if (!wifiState) {
            wifiManager.setWifiEnabled(true);
            wifiState = true;
            imageButton.setImageResource(R.drawable.on);
        } else {
            wifiManager.setWifiEnabled(false);
            wifiState = false;
            imageButton.setImageResource(R.drawable.off);
        }
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
