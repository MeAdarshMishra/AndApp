package com.example.andapp;
// Database Page
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabasePage extends AppCompatActivity {
    EditText e1, e2, e3, e4;
    Button b1;
    TextView t1;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_page);
        t1 = findViewById(R.id.RealtimedatabaseTextview);
        e1 = findViewById(R.id.nametextdatabase);
        e2 = findViewById(R.id.passwordtextdatabase);
        e3 = findViewById(R.id.emaildatabase);
        e4 = findViewById(R.id.numberdatabase);
        b1 = findViewById(R.id.savedatabase);
        firebaseDatabase = FirebaseDatabase.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference = firebaseDatabase.getReference("users");
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                if (s4.length() != 10) {
                    e4.setError("Not a valid Number!");
                } else {
                    Users users = new Users(s1, s2, s3, s4);
                    databaseReference.child(s4).setValue(users);
                    Toast.makeText(DatabasePage.this, "Database Saved", Toast.LENGTH_SHORT).show();
                    Intent a = new Intent(DatabasePage.this, AllApp.class);
                    startActivity(a);
                    finish();
                }
            }
        });
    }
}
