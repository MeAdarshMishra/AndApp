package com.example.andapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OfflineLogin extends AppCompatActivity {
    Button b1, b2, b3;
    EditText e1, e2;
    TextView t1;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_login);
        b1 = findViewById(R.id.signin);
        b2 = findViewById(R.id.LoginSignup);
        b3 = findViewById(R.id.loginpageback);
        e1 = findViewById(R.id.loginemail);
        e2 = findViewById(R.id.loginpassword);
        e2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        t1 = findViewById(R.id.newIdSignUp);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isignup = new Intent(OfflineLogin.this, OfflineSignup.class);
                startActivity(isignup);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();

                if (email.equals("") || password.equals("")) {
                    Toast.makeText(OfflineLogin.this, "Incorrect E-mail", Toast.LENGTH_SHORT).show();
                } else {
                    SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("authentication", MODE_PRIVATE, null);
                    String query = "select * from user where email ='" + email + "' and password = '" + password + "'";
                    Cursor cursor = sqLiteDatabase.rawQuery(query, null);

                    if (cursor.getCount() > 0) {
                        Toast.makeText(OfflineLogin.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(OfflineLogin.this, DatabasePage.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(OfflineLogin.this, "Miss Match!", Toast.LENGTH_SHORT).show();
                    }
                }
            })
        }
    }
}