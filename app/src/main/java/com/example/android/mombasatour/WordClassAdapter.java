package com.example.android.mombasatour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordClassAdapter extends ArrayAdapter<WordClass> {

    private static final String LOG_TAG = WordClassAdapter.class.getSimpleName();

    public WordClassAdapter(Activity context, ArrayList<WordClass> numbersName) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, numbersName);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);

        }

        WordClass currentPosition = getItem(position);

        TextView messageText1 = (TextView) listItemView.findViewById(R.id.messageView1);
        messageText1.setText(currentPosition.getmTitle());

        TextView messageText2 = (TextView) listItemView.findViewById(R.id.messageView2);
        messageText2.setText(currentPosition.getmBody());

        ImageView tourImage = (ImageView) listItemView.findViewById(R.id.image);
        if(currentPosition.hasImage()) {
            tourImage.setImageResource(currentPosition.getmImage());
            tourImage.setVisibility(View.VISIBLE);
        }else {
            tourImage.setVisibility(View.GONE);
        }

        return listItemView;

    }
}
