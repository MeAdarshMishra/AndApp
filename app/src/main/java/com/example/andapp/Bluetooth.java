package com.example.andapp;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Bluetooth extends AppCompatActivity {
    ToggleButton toggleButton;
    BluetoothAdapter bluetoothAdapter;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        back = findViewById(R.id.blueback);
        toggleButton = findViewById(R.id.toggleButton);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bluetoothAdapter.enable();
            } else {
                bluetoothAdapter.disable();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Bluetooth.this, AllApp.class);
                startActivity(back);
                finish();
            }
        });
    }
}