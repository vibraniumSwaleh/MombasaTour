package com.example.android.mombasatour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 *
 * create an instance of the historical sites.
 */
public class HistoricalSitesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */


        //Array of numbers
        final ArrayList<WordClass> words = new ArrayList<WordClass>();
        //Assigning words to englishTranslation array
        words.add(new WordClass("Fort Jesus"));
        words.add(new WordClass("Mombasa Old Town"));
        words.add(new WordClass("Mombasa Tusks"));
        words.add(new WordClass("Bombolulu Workshops"));
        words.add(new WordClass("Hindu Temples"));
        words.add(new WordClass("Gede Ruins"));
        words.add(new WordClass("Kilifi"));

        WordClassAdapter itemsAdapter = new WordClassAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
