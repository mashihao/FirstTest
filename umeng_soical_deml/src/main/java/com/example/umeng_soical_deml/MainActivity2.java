package com.example.umeng_soical_deml;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

/**
 * Created by MSH on 2016/10/19.
 */

public class MainActivity2 extends FragmentActivity implements ImageFragment2.IntentBack {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide2);

        ViewPager defaultViewpager = (ViewPager) findViewById(R.id.viewpager_default2);

        DemoPagerAdapter2 demoPagerAdapter = new DemoPagerAdapter2(getSupportFragmentManager(), this);

        defaultViewpager.setAdapter(demoPagerAdapter);

    }

    @Override
    public void getIntentCallBack() {
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }
}
