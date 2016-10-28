package com.example.android.miwok;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static com.example.android.miwok.R.id.numbers;

public class NumbersActivity extends AppCompatActivity {
    // Add a constant final variable TAG to use it in our logs
    private static final String TAG = "NumbersActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);



        //Create an array of words
        String[] words = new String[10];
        words[0] = "one" ;
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v(TAG,"Word at index 0: " + words[0]);
        Log.v(TAG,"Word at index 1: " + words[1]);
        Log.v(TAG,"Word at index 2: " + words[2]);
        Log.v(TAG,"Word at index 4: " + words[3]);
        Log.v(TAG,"Word at index 4: " + words[4]);
        Log.v(TAG,"Word at index 5: " + words[5]);
        Log.v(TAG,"Word at index 6: " + words[6]);
        Log.v(TAG,"Word at index 7: " + words[7]);
        Log.v(TAG,"Word at index 8: " + words[8]);
        Log.v(TAG,"Word at index 9: " + words[9]);
        Log.v(TAG,"The size of the array is: " + words.length);
    }
}
