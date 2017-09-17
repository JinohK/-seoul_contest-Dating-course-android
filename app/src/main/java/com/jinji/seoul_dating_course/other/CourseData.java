package com.jinji.seoul_dating_course.other;

/**
 * Created by Jinoh on 2017-09-17.
 * 장소 정보 데이터
 */

public class CourseData {

    private String address;
    private String imageURL;
    private String infoURL;
    private String name;

    public CourseData(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getInfoURL() {
        return infoURL;
    }

    public void setInfoURL(String infoURL) {
        this.infoURL = infoURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
