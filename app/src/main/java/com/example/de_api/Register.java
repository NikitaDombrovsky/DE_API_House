package com.example.de_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Register extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        layout = findViewById(R.id.round_layout);
        layout.setBackgroundResource(R.drawable.rounded_layout);
    }

    public void showLog(View view){
        startActivity(new Intent(Register.this, Login.class));
    }
}