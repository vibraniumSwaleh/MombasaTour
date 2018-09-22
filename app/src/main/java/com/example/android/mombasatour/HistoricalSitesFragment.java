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

        //Array of numbers
        final ArrayList<WordClass> words = new ArrayList<WordClass>();
        //Assigning words to englishTranslation array
        words.add(new WordClass("Fort Jesus",getString(R.string.fort_jesus_facts), R.drawable.fort_jesus));
        words.add(new WordClass("Mombasa Old Town",getString(R.string.mombasa_old_town_facts), R.drawable.old_town));
        words.add(new WordClass("Mombasa Tusks",getString(R.string.mombasa_tusks_facts), R.drawable.mombasa_tusks));
        words.add(new WordClass("Bombolulu Workshops",getString(R.string.bombolulu_workshops_facts), R.drawable.bombolulu_workshops));
        words.add(new WordClass("Hindu Temples",getString(R.string.hindu_temples_facts), R.drawable.hindu_temple));

        WordClassAdapter itemsAdapter = new WordClassAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
