package com.example.andapp;

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

public class OfflineSignup extends AppCompatActivity {
    Button b1, b2, b3;
    EditText e1, e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_signup);
        b1 = findViewById(R.id.signupbutton);
        b2 = findViewById(R.id.oldsigninButton);
        b3 = findViewById(R.id.signuppageback);
        e1 = findViewById(R.id.signupemailtext);
        e2 = findViewById(R.id.signuppassword);
        e2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        t1 = findViewById(R.id.oldSignInText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();

                if (email.equals("") || password.equals("")) {
                    Toast.makeText(OfflineSignup.this, "Please Complete the details!", Toast.LENGTH_SHORT).show();
                } else {
                    SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("authentication", MODE_PRIVATE, null);
                    sqLiteDatabase.execSQL("create table if not exists user (email varchar, password varchar)");
                    String query = "select * from user where email = '" + email + "' and password = '" + password + "'";
                    Cursor cursor = sqLiteDatabase.rawQuery(query, null);

                    if (cursor.getCount() > 0) {

                        Toast.makeText(OfflineSignup.this, "Already have a account!", Toast.LENGTH_SHORT).show();
                    } else {
                        sqLiteDatabase.execSQL("insert into user values ('" + email + "' , '" + password + "')");
                        Toast.makeText(OfflineSignup.this, "Successfully Updated!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(OfflineSignup.this, OfflineLogin.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent old = new Intent(OfflineSignup.this, OfflineLogin.class);
                startActivity(old);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(OfflineSignup.this, OfflineLogin.class);
                startActivity(back);
                finish();
            }
        });
    }
}