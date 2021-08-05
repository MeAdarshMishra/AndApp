package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    Button b1, b2;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        b1 = findViewById(R.id.online);
        b2 = findViewById(R.id.offline);
        t1 = findViewById(R.id.logintext);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent on = new Intent(LoginPage.this, OnlineLogin.class);
                startActivity(on);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent of = new Intent(LoginPage.this, OfflineLogin.class);
                startActivity(of);
                finish();
            }
        });


    }
}