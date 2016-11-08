package com.example.android.miwok;

import android.app.Activity;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'aacha"));

/*
        //Add TextViews to the screen for each number using a for loop.

        for (int index=0;index < words.size();index++){
            //Find the root view of the whole layout
            LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_numbers);
            //Create a new {@link TextView} that displayed the word at the index and add the View
            // as a child to the rootView
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

        }*/

        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
