package com.jinji.seoul_dating_course.other;

import java.util.ArrayList;

/**
 * Created by Jinoh on 2017-09-17.
 * 누적코스 전체 데이터
 */

public class AccumulatedData {
    private ArrayList<CourseData> courses;
    private String startAddress;

    public AccumulatedData(String startAddress) {
        this.startAddress = startAddress;
    }

    public AccumulatedData(String startAddress, ArrayList<CourseData> courses) {
        this.courses = courses;
        this.startAddress = startAddress;
    }

    public ArrayList<CourseData> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseData> courses) {
        this.courses = courses;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }
}
