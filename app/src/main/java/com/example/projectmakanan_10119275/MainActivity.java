package com.example.projectmakanan_10119275;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectmakanan_10119275.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    //Nama : Dafana Fikri
//Kelas : IF7
//Nim : 10119275
    BottomNavigationView bottomNavigationView;
    FragmenPeta petaFragmen = new FragmenPeta();
    SettingFragment settingFragment = new SettingFragment();
    Aplikasi aplikasi = new Aplikasi();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, petaFragmen).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, petaFragmen).commit();
                        return true;

                    case R.id.tentang:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, settingFragment).commit();
                        return true;

                    case R.id.aplikasi:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, aplikasi).commit();
                        return true;
                }

                return false;
            }
        });


    }
}