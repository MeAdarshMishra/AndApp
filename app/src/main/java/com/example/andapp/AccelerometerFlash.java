package com.example.andapp;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class AccelerometerFlash extends AppCompatActivity implements SensorEventListener {
    Button back;
    Sensor sensor;
    SensorManager sensorManager;
    CameraManager cameraManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_flash);
        back = findViewById(R.id.aflashb);
        cameraManager = (CameraManager) getSystemService(CAMERA_SERVICE);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AccelerometerFlash.this, AccelerometerSensor.class);
                startActivity(i);
                finish();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        int x1 = (int) x;
        int y1 = (int) y;
        int z1 = (int) z;

        if (x1 != 0 || y1 != 0 || z1 != 0) {
            try {
                String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                cameraManager.setTorchMode(cameraIdForFlashlight, true);
            } catch (CameraAccessException exception) {
                System.out.println(exception);
            }
        } else {
            try {
                String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                cameraManager.setTorchMode(cameraIdForFlashlight, false);
            } catch (CameraAccessException exception) {
                System.out.println(exception);
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}