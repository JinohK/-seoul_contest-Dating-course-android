package com.jinji.seoul_dating_course;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import com.jinji.seoul_dating_course.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    private void init(){
        TabHost tabHost = binding.tabHost;
        tabHost.setup();
        TabHost.TabSpec ts = tabHost.newTabSpec("Tab Spec1");
        ts.setContent(R.id.content1);
        ts.setIndicator("누적코스");
        tabHost.addTab(ts);

        ts = tabHost.newTabSpec("Tab Spec2");
        ts.setContent(R.id.content2);
        ts.setIndicator("오늘의코스");
        tabHost.addTab(ts);

        ts = tabHost.newTabSpec("Tab Spec3");
        ts.setContent(R.id.content3);
        ts.setIndicator("마이페이지");
        tabHost.addTab(ts);
    }
}
