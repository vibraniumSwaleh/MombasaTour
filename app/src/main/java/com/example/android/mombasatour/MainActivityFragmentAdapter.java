package com.example.android.mombasatour;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainActivityFragmentAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public MainActivityFragmentAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0){
            return new BeachFragment();
        }else if (position == 1){
            return new HistoricalSitesFragment();
        }else if (position == 2){
            return new HotelsFragment();
        }else if (position == 3){
            return new TouristAttractionSitesFragment();
        }else return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.beach_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.h_site_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.hotel_fragment);
        } else {
            return mContext.getString(R.string.tourist_attraction_sites_fragment);
        }
    }
}
