package com.example.android.mombasatour;

public class WordClass {

    //class variables
    private String mBody;
    private String mTitle;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    //Class constructor with image
    public WordClass(String title, String body, int image){
        mTitle = title;
        mBody = body;
        mImageResourceId = image;
    }

    //Class constructor without image
    public WordClass(String title, String body){
        mBody = body;
        mTitle = title;
    }

    //Method to get message title
    public String getmTitle() {
        return mTitle;
    }

    //Method to get message body
    public String getmBody() {
        return mBody;
    }

    //Mehtod to get image
    public int getmImage() {
        return mImageResourceId;
    }

    //return true if Image is present and false if image is absent
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
}
