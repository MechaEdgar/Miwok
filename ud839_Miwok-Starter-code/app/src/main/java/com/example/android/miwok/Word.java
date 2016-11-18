package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by ed on 04/11/2016.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    //** Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private  String mMiwokTranslation;

    //**Image resource ID for the word*/
    private int mImageResourceId ;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /*
    Get the Image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }



}


