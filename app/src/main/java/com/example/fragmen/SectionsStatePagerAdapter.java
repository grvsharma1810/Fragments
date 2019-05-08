package com.example.fragmen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mfragmentList = new ArrayList<>();
    private final List<String> mfragmentTitleList = new ArrayList<>();

    SectionsStatePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public void addFragment(Fragment fragment, String name)
    {
        mfragmentList.add(fragment);
        mfragmentTitleList.add(name);
    }

    @Override
    public Fragment getItem(int i) {
        return mfragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }
}
