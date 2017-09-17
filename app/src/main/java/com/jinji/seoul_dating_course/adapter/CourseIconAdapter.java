package com.jinji.seoul_dating_course.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.jinji.seoul_dating_course.R;
import com.jinji.seoul_dating_course.other.CourseData;

import java.util.ArrayList;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by Jinoh on 2017-09-17.
 * 누적 데이터코스 안 코스별 아이콘 recycler 어뎁터
 */

public class CourseIconAdapter extends RecyclerView.Adapter<CourseIconAdapter.CourseIconHolder> {
    public static final String TAG = "CourseIconAdapter";

    public ArrayList<CourseData> courseDatas;
    private Context context;

    public CourseIconAdapter(Context context, ArrayList<CourseData> datas) {
        this.context = context;
        this.courseDatas = datas;
    }

    @Override
    public CourseIconHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_courseicon, parent, false);
        return new CourseIconHolder(view);
    }

    @Override
    public void onBindViewHolder(CourseIconHolder holder, int position) {
        CourseData data = courseDatas.get(position);
        Glide.with(context)
                .load(data.getImageURL())
                .apply(RequestOptions.bitmapTransform(new CropCircleTransformation()))
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return courseDatas.size();
    }



    public class CourseIconHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public CourseIconHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
