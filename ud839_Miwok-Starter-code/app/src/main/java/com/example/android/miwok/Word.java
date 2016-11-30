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
    private int mImageResourceId = NO_IMAGE_PROVIDED ;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Audio resource Id for the word
    private int mAudioResourceId;

    /**
     * Defining the Word constructor with 2 strings and 1 int for the rest of activities
     * @param defaultTranslation is the word in a language that the user use (english)
     * @param miwokTranslation is the word in the Mikow language
     * @param imageResourceId is the drawable resource ID for the image asset
     * @param audioResourceId is the audio Resource for the audio file associated with this word.
     **/


        public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    /**Defining the Word constructor with 2 strings for PhrasesActivity
     * @param defaultTranslation is the word in a language that the user use(english)
     * @param miwokTranslation is the word in the Miwok translation
     * @param audioResourceId is the audio Resource for the audio file associated with this word.
     **/
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
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

    /**
     * Returns whether or not there is an image for this word.
     * @return boolean true or false
     */
    public boolean hasImage(){
    return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the audio resource ID of the word.
     * @return int
     */
    public int getmAudioResourceId(){return mAudioResourceId; }

}


