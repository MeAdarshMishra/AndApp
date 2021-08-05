package com.example.andapp;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AccelerometerBluetooth extends AppCompatActivity implements SensorEventListener {
    BluetoothAdapter bluetoothAdapter;
    Button back;
    SensorManager sensorManager;
    Sensor sensor;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_bluetooth);
        back = findViewById(R.id.abluetoothback);
        t1 = findViewById(R.id.textabluetooth);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(AccelerometerBluetooth.this, AccelerometerSensor.class);
                startActivity(back);
                finish();
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        int x1 = (int) x;
        int y1 = (int) y;
        int z1 = (int) z;

        if (x1 != 0 || y1 != 0 || z1 != 0) {
            bluetoothAdapter.enable();
        } else {
            bluetoothAdapter.disable();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}