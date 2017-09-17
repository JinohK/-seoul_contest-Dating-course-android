package com.jinji.seoul_dating_course.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jinji.seoul_dating_course.R;

/**
 * Created by Jinoh on 2017-09-17.
 * 오늘의코스 - 슬라이드 코스 fragment
 */

public class CourseFragment extends Fragment {
    public static final String TAG = "CourseFragment";
    private static final String ARG_IMAGE_URL = "ARG_IMAGE_URL";

    public CourseFragment() {
    }
    public static CourseFragment newInstance(String imageURL) {
        CourseFragment fragment = new CourseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_IMAGE_URL, imageURL);
        fragment.setArguments(args);
        Log.d(TAG, "newInstance");
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_course, container, false);
        ImageView background = (ImageView) rootView.findViewById(R.id.ivBackground);
        String url = getArguments().getString(ARG_IMAGE_URL);
        Glide.with(rootView).load(url).into(background);
        return rootView;
    }
}
