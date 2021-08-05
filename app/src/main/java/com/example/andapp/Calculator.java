package com.example.andapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2, b3, b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        t1 = findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f2 + f1;
                String s3 = Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "The Sum Of the number is " + s3, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f2 - f1;
                String s3 = Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "Result is" + s3, Toast.LENGTH_SHORT).show();


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 * f2;
                String s3 = Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "Reasult is " + s3, Toast.LENGTH_SHORT).show();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 / f2;
                String s3 = Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "Result is " + s3, Toast.LENGTH_SHORT).show();
            }
        });
    }
}