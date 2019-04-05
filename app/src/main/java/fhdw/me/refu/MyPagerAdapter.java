package fhdw.me.refu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;
    private double rentenleistung;
    private double kapitalleistung;

    public MyPagerAdapter(FragmentManager fragmentManager , double mRentenleistung, double mKapitalleistung){
        super(fragmentManager);
        rentenleistung = mRentenleistung;
        kapitalleistung = mKapitalleistung;
    }

    @Override
    public int getCount(){
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position){
        switch (position) {
            case 0:
                return ErgebnisFragment.newInstance(0, "Rentenleistung" , rentenleistung);
            case 1:
                return ErgebnisFragment.newInstance(1, "Kapitalleistung", kapitalleistung);
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position){
        return "Page " + position;
    }
}
