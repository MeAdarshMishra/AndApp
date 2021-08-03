package com.example.andapp;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
            }
        });
    }
}