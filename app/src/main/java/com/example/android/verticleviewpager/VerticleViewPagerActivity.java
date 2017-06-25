package com.example.android.verticleviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class VerticleViewPagerActivity extends AppCompatActivity {

    VerticalViewPager verticalViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.card_view);
//        setSupportActionBar(toolbar);

//        final ArrayList<ContactInfo> numList = new ArrayList<ContactInfo>();
        verticalViewPager = (VerticalViewPager) findViewById(R.id.VerticleViewPager);
        verticalViewPager.setAdapter(new VerticleViewPagerAdapter(this));
    }
}
