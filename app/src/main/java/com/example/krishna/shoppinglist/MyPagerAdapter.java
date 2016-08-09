package com.example.krishna.shoppinglist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Krishna on 07-08-2016.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    int count =5;
    public MyPagerAdapter(FragmentManager fm){

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new OnBoardingFragment(position);
    }


    @Override
    public int getCount() {
        return count;
    }
}
