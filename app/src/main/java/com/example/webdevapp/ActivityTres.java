package com.example.webdevapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;
import java.util.TimerTask;


public class ActivityTres extends AppCompatActivity implements View.OnClickListener {

    Button Back_btn;
    Button Start_button_btn;
    Button Reset_button_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tres);

        Back_btn = findViewById(R.id.Back);
        Back_btn.setOnClickListener(this);
        Start_button_btn = findViewById(R.id.Start_button);
        Start_button_btn.setOnClickListener(this);
        Reset_button_btn = findViewById(R.id.reset_button);
        Reset_button_btn.setOnClickListener(this);

    }






    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Start_button){

        }else if (view.getId() == R.id.reset_button){

        }else if (view.getId() == R.id.Back){
        finish();
        }
    }}

    public void Set_up_timer(){
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable(){
                    @Override
                    public void run() {

                    }
                }
            });
        }
    },0,1000);
}


