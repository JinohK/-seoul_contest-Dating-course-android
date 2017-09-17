package com.jinji.seoul_dating_course.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jinji.seoul_dating_course.R;
import com.jinji.seoul_dating_course.adapter.AccumulatedAdapter;
import com.jinji.seoul_dating_course.other.AccumulatedData;
import com.jinji.seoul_dating_course.other.CourseData;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jinoh on 2017-09-11.
 * 누적코스 fragment
 */

public class AccumulatedFragment extends Fragment {
    public static final String TAG = "AccumulatedFragment";
    private ArrayList<AccumulatedData> accumulatedDatas;
    private AccumulatedAdapter adapter;
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        accumulatedDatas = new ArrayList<>();
        ArrayList<String> url = new ArrayList<String>(Arrays.asList("https://wavbs.com/content/2794/no-3444.png", "https://wavbs.com/content/2900/u2-4438.jpg", "https://wavbs.com/content/2896/uuuuddd-4317.png", "https://wavbs.com/content/2923/세로-4469.png"));
        ArrayList<CourseData> c = new ArrayList<>();
        c.add(new CourseData(url.get(0)));
        c.add(new CourseData(url.get(1)));
        c.add(new CourseData(url.get(2)));
        c.add(new CourseData(url.get(3)));

        ArrayList<CourseData> b = new ArrayList<>();
        b.add(new CourseData(url.get(3)));
        b.add(new CourseData(url.get(2)));
        b.add(new CourseData(url.get(1)));
        b.add(new CourseData(url.get(0)));

        accumulatedDatas.add(new AccumulatedData("경기도 시흥시 월곶동 풍림아파트", c));
        accumulatedDatas.add(new AccumulatedData("경기도 안산시 상록구 일동 107-1", b));

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        adapter = new AccumulatedAdapter(getActivity(), accumulatedDatas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;
    }
}


