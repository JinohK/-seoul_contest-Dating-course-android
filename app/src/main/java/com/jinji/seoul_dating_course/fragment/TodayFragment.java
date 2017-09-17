package com.jinji.seoul_dating_course.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jinji.seoul_dating_course.R;
import com.jinji.seoul_dating_course.adapter.CoursePagerAdapter;
import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.UnderlinePageIndicator;

/**
 * Created by Jinoh on 2017-09-11.
 * 오늘의코스 fragment
 */

public class TodayFragment extends Fragment {
    public static final String TAG = "TodayFragment";


    PageIndicator mIndicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        ViewPager viewpager = (ViewPager) view.findViewById(R.id.viewpager);

        String[] url = {"https://wavbs.com/content/2794/no-3444.png", "https://wavbs.com/content/2900/u2-4438.jpg", "https://wavbs.com/content/2896/uuuuddd-4317.png", "https://wavbs.com/content/2923/세로-4469.png"};
        CoursePagerAdapter adapter = new CoursePagerAdapter(getChildFragmentManager(), url);
        viewpager.setAdapter(adapter);
//        viewpager.setClipToPadding(false);
//        viewpager.setPadding(40, 0, 40, 0);
//        viewpager.setPageMargin(getResources().getDisplayMetrics().widthPixels / -9);
        UnderlinePageIndicator indicator = (UnderlinePageIndicator) view.findViewById(R.id.indicator);
        indicator.setViewPager(viewpager);
        indicator.setFades(false);
        mIndicator = indicator;

        Log.d(TAG, adapter.getCount()+"");
        return view;
    }
}


