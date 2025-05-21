package com.example.webdevapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityDos extends AppCompatActivity implements View.OnClickListener {
    Button  BackButton_btn;
    Button  LeBackButton_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dos);


        BackButton_btn = findViewById(R.id.BackButton);
        BackButton_btn.setOnClickListener(this);

        LeBackButton_btn = findViewById(R.id.LeBackButton);
        LeBackButton_btn.setOnClickListener(this);

    }




    public class ActivityDoss extends AppCompatActivity implements View.OnClickListener {
        Button add_button;
        Button minus_button;
        TextView count_val;
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });


            add_button = findViewById(R.id.add_button);
            minus_button = findViewById(R.id.minus_button);
            count_val = findViewById(R.id.count_val);


            add_button.setOnClickListener(this);
            minus_button.setOnClickListener(this);




        }


        @Override
        public void onClick(View v) {


            int current_val = Integer.parseInt(count_val.getText().toString());
            int new_val = current_val;


            if (v.getId() == R.id.add_button){
                new_val = current_val +1;


            } else if (v.getId() == R.id.minus_button) {
                new_val = current_val -1;
            }
            count_val.setText(String.valueOf(new_val));


        }
    }

    public class ActivtyDosss extends AppCompatActivity implements View.OnClickListener {
        Button add_button2;
        Button minus_button2;
        TextView count_val2;
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });


            add_button2 = findViewById(R.id.add_button2);
            minus_button2 = findViewById(R.id.minus_button2);
            count_val2 = findViewById(R.id.count_val2);


            add_button2.setOnClickListener(this);
            minus_button2.setOnClickListener(this);




        }


        @Override
        public void onClick(View v) {


            int current_val = Integer.parseInt(count_val2.getText().toString());
            int new_val = current_val;


            if (v.getId() == R.id.add_button){
                new_val = current_val +1;


            } else if (v.getId() == R.id.minus_button) {
                new_val = current_val -1;
            }
            count_val2.setText(String.valueOf(new_val));


        }
    }























    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.BackButton){
            switchActivity();

        }else if (view.getId() == R.id.LeBackButton){
            finish();
        }

    }

    public void switchActivity(){
        Intent switchActivityIntent = new Intent(this,ActivityTres.class);
        startActivity(switchActivityIntent);

    }

}
