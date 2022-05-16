package com.example.de_api;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.common.hash.Hashing;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import java.nio.charset.StandardCharsets;

public class RoomActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    BadgeDrawable Badge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        // TODO HASH
        final String hashed = Hashing.sha256()
                .hashString("your input", StandardCharsets.UTF_8)
                .toString();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);//fragmentContainerView
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
}
