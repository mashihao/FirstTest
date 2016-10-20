package com.example.umeng_soical_deml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity implements ImageFragment.IntentBack {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        ViewPager defaultViewpager = (ViewPager) findViewById(R.id.viewpager_default);
        DemoPagerAdapter defaultPagerAdapter = new DemoPagerAdapter(getSupportFragmentManager(),this);
        defaultViewpager.setAdapter(defaultPagerAdapter);
    }

    @Override
    public void getIntentCallBack() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
