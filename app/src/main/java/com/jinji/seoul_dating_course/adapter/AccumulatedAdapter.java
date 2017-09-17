package com.jinji.seoul_dating_course.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.jinji.seoul_dating_course.R;
import com.jinji.seoul_dating_course.other.AccumulatedData;

import java.util.ArrayList;

/**
 * Created by Jinoh on 2017-09-17.
 * 누적 데이터코스 recycler 어뎁터
 */

public class AccumulatedAdapter extends RecyclerView.Adapter<AccumulatedAdapter.AccumulatedHolder> {
    public static final String TAG = "AccumulatedAdapter";

    public ArrayList<AccumulatedData> accumulatedDatas;
    private Context context;

    public AccumulatedAdapter(Context context, ArrayList<AccumulatedData> datas) {
        this.context = context;
        this.accumulatedDatas = datas;
    }

    @Override
    public AccumulatedHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_accumulated, parent, false);
        return new AccumulatedHolder(view);
    }

    @Override
    public void onBindViewHolder(AccumulatedHolder holder, int position) {
        AccumulatedData data = accumulatedDatas.get(position);
        holder.tvAddress.setText(data.getStartAddress());
        CourseIconAdapter adapter = new CourseIconAdapter(context, data.getCourses());
        holder.recycler.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recycler.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return accumulatedDatas.size();
    }



    public class AccumulatedHolder extends RecyclerView.ViewHolder{
        public TextView tvAddress;
        public RecyclerView recycler;
        public ImageButton ibDetail;
        public AccumulatedHolder(View itemView) {
            super(itemView);
            tvAddress = (TextView) itemView.findViewById(R.id.tvAddress);
            recycler = (RecyclerView) itemView.findViewById(R.id.recycler);
            ibDetail = (ImageButton) itemView.findViewById(R.id.ibDetail);

        }
    }
}
