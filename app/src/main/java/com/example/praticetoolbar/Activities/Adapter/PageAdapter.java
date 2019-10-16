package com.example.praticetoolbar.Activities.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.praticetoolbar.Fragments.FormFragment;
import com.example.praticetoolbar.Fragments.ListFragment;

public class PageAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public PageAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new FormFragment();
            case 1:
                return new ListFragment();

                default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
