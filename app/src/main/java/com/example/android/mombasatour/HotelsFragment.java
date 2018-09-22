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
 * create an instance of the hotel fragment.
 */
public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Array of numbers
        final ArrayList<WordClass> words = new ArrayList<WordClass>();
        //Assigning words to englishTranslation array
        words.add(new WordClass("Blue Room Restaurant",getString(R.string.blueroom_facts), R.drawable.blueroom));
        words.add(new WordClass("Galaxy Chinese",getString(R.string.galaxy_chinese_facts), R.drawable.galaxy_chinese));
        words.add(new WordClass("La Marina",getString(R.string.la_marina_facts), R.drawable.la_marina));
        words.add(new WordClass("Thalassa restaurant and lounge",getString(R.string.thalassa_facts), R.drawable.thalassa));
        words.add(new WordClass("Shehnai Restaurant",getString(R.string.shehnai_facts), R.drawable.shehnai));
        words.add(new WordClass("Tamarind Restaurant",getString(R.string.tamarind_facts), R.drawable.tamarind));
        words.add(new WordClass("The Moorings",getString(R.string.moorings_facts), R.drawable.moorings));

        WordClassAdapter itemsAdapter = new WordClassAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
