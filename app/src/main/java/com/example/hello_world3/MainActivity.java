package com.example.hello_world3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    View view;

private static final String TAG = "My New App";
private static final String MSG = "If message pops up. This is successful";
private static final String TEXT = "Great Job!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.colorPrimary);

        Button btn = findViewById(R.id.btnClick);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, MSG);
                Toast.makeText(getApplicationContext(), TEXT, Toast.LENGTH_SHORT).show();


                Button btn = findViewById(R.id.btnChangeBackgroundColor);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                      Random random = new Random();
                      int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                       view.setBackgroundColor(color);
                    }
                });

            }
        });
    }}
