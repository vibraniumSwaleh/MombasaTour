package com.example.android.mombasatour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager mainPager = (ViewPager)findViewById(R.id.viewPager);
        // Create an adapter that knows which fragment should be shown on each page
        MainActivityFragmentAdapter adapter = new MainActivityFragmentAdapter(this, getSupportFragmentManager());
        // Set the adapter onto the view pager
        mainPager.setAdapter(adapter);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout)findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(mainPager);
    }
}
