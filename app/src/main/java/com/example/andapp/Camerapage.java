package com.example.andapp;
//Main Camera Page
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Camerapage extends AppCompatActivity {
    Button video, camera, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camerapage);
        video = findViewById(R.id.camerapagevideo);
        camera = findViewById(R.id.camerapagecamera);
        back = findViewById(R.id.backcamerapage);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Camerapage.this, AllApp.class);
                startActivity(back);
                finish();
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videop = new Intent(Camerapage.this, Video.class);
                startActivity(videop);
                finish();
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camerap = new Intent(Camerapage.this, Camera.class);
                startActivity(camerap);
                finish();
            }
        });
    }
}
