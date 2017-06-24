package com.example.android.verticleviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.android.verticleviewpager.R;
import com.example.android.verticleviewpager.VerticleViewPager;

public class VerticleViewPagerActivity extends AppCompatActivity {

    VerticleViewPager verticalViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.card_view);
        setSupportActionBar(toolbar);

        verticalViewPager = (VerticleViewPager) findViewById(R.id.VerticleViewPager);
        verticalViewPager.setAdapter(new VerticleViewPager(this));
    }
}
