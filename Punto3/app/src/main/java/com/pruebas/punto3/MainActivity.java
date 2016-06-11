package com.pruebas.punto3;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.pruebas.punto3.adapter.PagerAdapter;
import com.pruebas.punto3.fragment.SlideFragment;

public class MainActivity extends FragmentActivity {

    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pager = (ViewPager) this.findViewById(R.id.pager);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        //adapter.addFragment(SlideFragment.newInstance(0, "WIFI"));
        adapter.addFragment(SlideFragment.newInstance(1, "Ciudades"));
        this.pager.setAdapter(adapter);

    }
}
