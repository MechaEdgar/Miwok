package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    // Add a constant final variable TAG to use it in our logs
    private static final String TAG = "NumbersActivity";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create and ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));


/*
        //Add TextViews to the screen for each number using a for loop.

        for (int index=0;index < words.size();index++){
            //Find the root view of the whole layout
            LinearLayout rootView = (LinearLayout) findViewById(R.id.word_list);
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
