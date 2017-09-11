package com.jinji.seoul_dating_course.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.jinji.seoul_dating_course.R;
import com.jinji.seoul_dating_course.databinding.ActivityMainBinding;
import com.jinji.seoul_dating_course.fragment.Fragment1;
import com.jinji.seoul_dating_course.fragment.Fragment2;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    private void init(){
        // 툴바 설정
        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        // 탭 설정
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
        TabLayout tabs = binding.tablayout;
        tabs.addTab(tabs.newTab().setText("오늘의코스"));
        tabs.addTab(tabs.newTab().setText("누적코스"));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Fragment selected = null;
                if(position==0){
                    selected = fragment1;
                }else if(position==1){
                    selected = fragment2;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
