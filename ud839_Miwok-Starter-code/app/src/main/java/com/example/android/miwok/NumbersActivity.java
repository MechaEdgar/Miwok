package com.example.android.miwok;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class NumbersActivity extends AppCompatActivity {
    // Add a constant final variable TAG to use it in our logs
    private static final String TAG = "NumbersActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create and ArrayList of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //Add TextViews to the screen for each number using a while loop.
        int index = 0;
        while (index < 10) {
            LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_numbers);
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

            index++;

        }
        //Log to check the words
        //Log.v(TAG,"Word at index 2" + words.get(2));


    }
}
