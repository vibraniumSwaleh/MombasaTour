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
 * create an instance of the stadium fragment.
 */
public class TouristAttractionSitesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Array of numbers
        final ArrayList<WordClass> words = new ArrayList<WordClass>();
        //Assigning words to englishTranslation array
        words.add(new WordClass("Haller Park",getString(R.string.haller_park_facts),R.drawable.haller_park));
        words.add(new WordClass("Mombasa Marine National Park",getString(R.string.mombasa_marine_national_park_facts),R.drawable.mombasa_marine_national_park));
        words.add(new WordClass("Mamba Village Centre",getString(R.string.mamba_village_facts),R.drawable.mamba_village_centre));
        words.add(new WordClass("Mombasa Go-Kart",getString(R.string.go_kart_facts),R.drawable.mombasa_go_karts));
        words.add(new WordClass("Wasini Island",getString(R.string.wasini_island_facts),R.drawable.mombasa_wasini_island));
        words.add(new WordClass("Kisite-Mpunguti Marine National Park",getString(R.string.kisite_facts),R.drawable.mombasa_kisite_mpunguti_marine_national_park));
        words.add(new WordClass("Watamu",getString(R.string.watamu_facts),R.drawable.mombasa_watamu));

        WordClassAdapter itemsAdapter = new WordClassAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}