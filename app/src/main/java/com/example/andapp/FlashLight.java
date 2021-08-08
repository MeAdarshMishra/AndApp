package com.example.andapp;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class FlashLight extends AppCompatActivity {
    CameraManager cameraManager;
    Button backButton, on, off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_light);
        on = findViewById(R.id.flashon);
        off = findViewById(R.id.flashoff);
        backButton = findViewById(R.id.backflash);
        cameraManager = (CameraManager) getSystemService(CAMERA_SERVICE);

        on.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try {
                    String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(cameraIdForFlashlight, true);
                } catch (CameraAccessException exception) {
                    System.out.println(exception);
                }
            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try {
                    String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(cameraIdForFlashlight, false);
                } catch (CameraAccessException exception) {
                    System.out.println(exception);
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(FlashLight.this, Other.class);
                startActivity(back);
                finish();
            }
        });
    }
}

