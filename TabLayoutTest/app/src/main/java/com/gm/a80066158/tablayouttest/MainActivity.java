package com.gm.a80066158.tablayouttest;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TabLayout tabLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "<onCreate> start");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initContent();
    }

    private void initContent() {
        Log.i(TAG, "<initContent> start");

        //Fragment+ViewPager+FragmentViewPager组合的使用
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_FindFragment_pager);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),
                this);
        viewPager.setAdapter(adapter);

        //TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_FindFragment_title);
        tabLayout.setupWithViewPager(viewPager);
    }
}
