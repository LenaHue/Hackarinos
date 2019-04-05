package fhdw.me.refu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ergebnis extends Fragment {

    FragmentPagerAdapter adapterViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.ergebnis_viewpagerlayout,container,false);

        double rentenleistung = this.getArguments().getDouble("Rentenleistung");
        double kapitalleistung = this.getArguments().getDouble("Kapitalleistung");

        ViewPager vpPager = view.findViewById(R.id.viewPager);
        adapterViewPager = new MyPagerAdapter(getFragmentManager(), rentenleistung, kapitalleistung );
        vpPager.setAdapter(adapterViewPager);


        return view;

    }
}
