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

       // bottomNavigationView.findViewById(R.id.bottomNav);
       // getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new RoomFragment_1()).commit();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);//fragmentContainerView
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
       // Badge=bottomNavigationView.getOrCreateBadge(R.id.message);
        //Badge.setNumber(1000);
//
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//
//                return  true
//            }
//        });

    }
}
