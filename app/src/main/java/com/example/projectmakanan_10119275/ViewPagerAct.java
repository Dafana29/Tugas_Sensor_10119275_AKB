package com.example.projectmakanan_10119275;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectmakanan_10119275.R;
//Nama : Dafana Fikri
//Kelas : IF7
//Nim : 10119275
public class ViewPagerAct extends AppCompatActivity {
    Button button;
    androidx.viewpager.widget.ViewPager viewPager;
    int[] layouts;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.pager);

        layouts = new int[] {
                R.layout.layout_1,
                R.layout.layout_2
        };

        adapter = new Adapter(this, layouts);
        viewPager.setAdapter(adapter);


    }

    public void Alihkan(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
