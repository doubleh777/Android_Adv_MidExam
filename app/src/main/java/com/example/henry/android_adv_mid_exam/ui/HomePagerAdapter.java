package com.example.henry.android_adv_mid_exam.ui;

/**
 * Created by Henry on 15. 8. 16..
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.henry.android_adv_mid_exam.ui.session.SessionFragment;


class HomePagerAdapter extends FragmentPagerAdapter {

    static final int PAGE_COUNT = 3;

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new SessionFragment();
            case 1:
                return new EmptyFragment();
            case 2:
                return new SoranFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
