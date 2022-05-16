package com.example.de_api;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

public class RoomActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    BadgeDrawable Badge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);//fragmentContainerView
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
}
