package com.example.andapp;
//Main Home Button Page 
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    TextView t1;
    Button b1, b2, b3, b4, b5, b6, b7, b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t1 = findViewById(R.id.textView3);
        b1 = findViewById(R.id.offlineloginmainpage);
        b2 = findViewById(R.id.onlineloginmainpage);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent offline = new Intent(HomeActivity.this, OfflineLogin.class);
                startActivity(offline);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent online = new Intent(HomeActivity.this, OnlineLogin.class);
                startActivity(online);
                finish();
            }
        });
    }
}
