package com.example.de_api.LoginScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.de_api.R;

public class Login extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        layout = findViewById(R.id.round_layout);
        layout.setBackgroundResource(R.drawable.rounded_layout);
    }

    public void showReg(View view){
        startActivity(new Intent(Login.this, Register.class));
    }
}
