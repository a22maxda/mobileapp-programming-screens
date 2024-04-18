package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("Name");
            String number = extras.getString("Number");

            TextView nameText=findViewById(R.id.name);
            nameText.setText(name);

            TextView numberText=findViewById(R.id.number);
            numberText.setText(number);

        }
    }
}