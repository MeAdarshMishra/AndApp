package com.example.andapp;
// Internet Page
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Internet extends AppCompatActivity {
    WebView webView;
    EditText editText;
    Button web, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);
        webView = findViewById(R.id.Viewweb);
        editText = findViewById(R.id.textweb);
        web = findViewById(R.id.searchweb);
        back = findViewById(R.id.webback);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                webView.loadUrl(s);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Internet.this, AllApp.class);
                startActivity(back);
                finish();
            }
        });
    }
}
