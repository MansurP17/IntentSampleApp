package com.example.intentsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);

        txt1.setText(getIntent().getStringExtra("ism"));
        txt2.setText(getIntent().getStringExtra("familiya"));

    }
}