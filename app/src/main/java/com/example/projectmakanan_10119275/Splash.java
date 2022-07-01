package com.example.projectmakanan_10119275;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectmakanan_10119275.R;

public class Splash extends AppCompatActivity {
    //Nama : Dafana Fikri
//Kelas : IF7
//Nim : 10119275
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), ViewPagerAct.class));
                finish();
            }
        }, 3000);
    }
}
