package com.example.de_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    Animation rotateAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        UUID uuid = UUID.randomUUID();
        Toast.makeText(MainActivity.this, uuid.toString(), Toast.LENGTH_SHORT).show();

        imgView = findViewById(R.id.imgLogo);
        rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        imgView.startAnimation(rotateAnim);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        }, 5000);
    }
}