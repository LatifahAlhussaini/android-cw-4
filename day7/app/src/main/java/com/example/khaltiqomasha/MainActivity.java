package com.example.khaltiqomasha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.viewpager2);
        TabLayout tl = findViewById(R.id.tabLayout);


        fragmentAdapter adapter = new fragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);


        tl.setupWithViewPager(vp);
        tl.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        tl.getTabAt(1).setIcon(R.drawable.ic_baseline_format_list_bulleted_24);
        tl.getTabAt(2).setIcon(R.drawable.ic_baseline_brightness_1_24);



    }
}