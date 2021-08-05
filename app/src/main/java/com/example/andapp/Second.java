package com.example.andapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

public class Second extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    Button button, b2;
    FirebaseAuth firebaseAuth;
    GoogleSignInClient googleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = findViewById(R.id.imageViewsecond);
        textView = findViewById(R.id.textViewsecond);
        button = findViewById(R.id.buttonsecond);
        b2 = findViewById(R.id.button2second);
        firebaseAuth = FirebaseAuth.getInstance();
        googleSignInClient = GoogleSignIn.getClient(Second.this, GoogleSignInOptions.DEFAULT_SIGN_IN);
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser != null) {
            Glide.with(Second.this).load(firebaseUser.getPhotoUrl()).into(imageView);
            textView.setText(firebaseUser.getDisplayName());
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                googleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            firebaseAuth.signOut();
                            Toast.makeText(Second.this, "SignOut", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }
                });
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Second.this, AccelerometerSensor.class);
                startActivity(k);
                finish();
            }
        });

    }
}