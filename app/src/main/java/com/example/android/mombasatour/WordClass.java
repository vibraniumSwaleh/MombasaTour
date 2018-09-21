package com.example.android.mombasatour;

public class WordClass {

    //class variables
    private String mMessage;
    private int mImage;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    //Class constructor with image
    public WordClass(String message, int image){
        mMessage = message;
        mImage = image;
    }

    //Class constructor without image
    public WordClass(String message){
        mMessage = message;
    }

    //Method to get message
    public String getmMessage() {
        return mMessage;
    }

    //Mehtod to get image
    public int getmImage() {
        return mImage;
    }

    //return true if Image is present and false if image is absent
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
}
