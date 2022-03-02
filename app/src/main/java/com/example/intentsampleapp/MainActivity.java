package com.example.intentsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);


        btn1.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this, NextActivity.class);
            intent.putExtra("ism","Mansur");
            intent.putExtra("familiya", "Pardayev");
            startActivity(intent);
        });

        btn2.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this, NextActivity.class);
            intent.putExtra("ism","Mansur -2");
            intent.putExtra("familiya", "Pardayev -2");
            startActivity(intent);
        });

        btn3.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this, NextActivity.class);
            intent.putExtra("ism","Mansur -3");
            intent.putExtra("familiya", "Pardayev -3");
            startActivity(intent);
        });

        btn4.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this, NextActivity.class);
            intent.putExtra("ism","Mansur -4");
            intent.putExtra("familiya", "Pardayev -4");
            startActivity(intent);
        });

        btn5.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this, NextActivity.class);
            intent.putExtra("ism","Mansur -5");
            intent.putExtra("familiya", "Pardayev -5");
            startActivity(intent);
        });

    }
}