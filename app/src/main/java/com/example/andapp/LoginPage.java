package com.example.andapp;

import android.os.Bundle;
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


    }
}