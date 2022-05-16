package com.example.de_api.common;

import android.os.Bundle;

import com.example.de_api.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.de_api.databinding.ActivityMajorIdBinding;

public class MajorActivity extends AppCompatActivity {

private ActivityMajorIdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


     binding = ActivityMajorIdBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_statics, R.id.navigation_routines)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_major_id);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}