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

    /**
     * Defining the Word constructor with 2 strings and 1 int for the rest of activities
     * @param DefaultTranslation is the word in a language that the user use (english)
     * @param MiwokTranslation is the word in the Mikow language
     * @param ImageResourceId is the Image
     **/
    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId){

    }

    /**Defining the Word constructor with 2 strings for PhrasesActivity
     * @param defaultTranslation is the word in a language that the user use(english)
     * @param miwokTranslation is the word in the Miwok translation
     **/
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


