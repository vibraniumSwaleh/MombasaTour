package com.example.android.mombasatour;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * create an instance of the beach fragment.
 */
public class BeachFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Array of numbers
        final ArrayList<WordClass> words = new ArrayList<WordClass>();
        //Assigning words to englishTranslation array
        words.add(new WordClass("Diani Beach",getString(R.string.diani_beach_facts)));
        words.add(new WordClass("Nyali Beach",getString(R.string.nyali_beach_facts)));
        words.add(new WordClass("Bamburi Beach",getString(R.string.bamburi_beach_facts)));
        words.add(new WordClass("Shanzu Beach",getString(R.string.shanzu_beach_facts)));
        words.add(new WordClass("Tiwi Beach",getString(R.string.tiwi_beach_facts)));
        words.add(new WordClass("Copacabana Beach",getString(R.string.copacabana_beach_facts)));

        WordClassAdapter itemsAdapter = new WordClassAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
