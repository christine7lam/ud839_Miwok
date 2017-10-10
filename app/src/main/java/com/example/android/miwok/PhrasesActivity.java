/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going", "minto wuksus"));
        words.add(new Word("What is your name", "tinne oyaase'ne"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michekses"));
        words.add(new Word("I'm feeling good", "kuchi achit"));
        words.add(new Word("Are you coming?", "eenes'aa"));
        words.add(new Word("Yes, I am coming.", "eenes'aa"));
        words.add(new Word("I'm coming.", "hee'eenem"));
        words.add(new Word("Let's go", "yoowutis"));
        words.add(new Word("Come here", "enni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.phraseslist);
        //GridView gridView = (GridView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        //gridView.setAdapter(itemsAdapter);
    }
}
