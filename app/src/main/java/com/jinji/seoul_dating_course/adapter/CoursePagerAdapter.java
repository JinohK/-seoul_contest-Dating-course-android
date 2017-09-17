package com.jinji.seoul_dating_course.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jinji.seoul_dating_course.fragment.CourseFragment;

/**
 * Created by Jinoh on 2017-09-17.
 */

public class CoursePagerAdapter extends FragmentPagerAdapter {
    public static final String TAG = "CoursePagerAdapter";
    private String[] images;

    public CoursePagerAdapter(FragmentManager fm, String[] ImageURLs) {
        super(fm);
        images = ImageURLs;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return CourseFragment.newInstance(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

//    @Override
//    public float getPageWidth(int position) {
//        return (0.9f);
//        return super.getPageWidth(position);
//    }


}
