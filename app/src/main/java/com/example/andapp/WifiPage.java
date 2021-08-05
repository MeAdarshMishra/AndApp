package com.example.andapp;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class WifiPage extends AppCompatActivity {
    Button backwifi;
    ToggleButton toggleButton;
    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_page);
        backwifi = findViewById(R.id.backwifi);
        toggleButton = findViewById(R.id.togglewifi);
        toggleButton.setOnCheckedChangeListener(((buttonView, isChecked) -> wifiManager.setWifiEnabled(isChecked)));
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
