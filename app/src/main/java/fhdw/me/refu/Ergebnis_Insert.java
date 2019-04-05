package fhdw.me.refu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ergebnis_Insert extends Fragment {


    Context context;
    private ViewPager mViewPager;
    private Ergebnis_CardPagerAdapter mCardAdapter;
    private Ergebnis_CardShadowTransformer mCardShadowTransformer;

    public Ergebnis_SwipeData activity;

    private UnfallschutzPerson unfallschutz;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.ergebnis_adapter,container,false);

        mViewPager = (ViewPager) view.findViewById(R.id.viewPager);
        mCardAdapter = new Ergebnis_CardPagerAdapter();

        //Double rentenleistung = this.getArguments().getDouble("Rentenleistung");
        //Double kapitalleistung = this.getArguments().getDouble("Kapitalleistung");

        Double rentenleistung = 213213.00;
        Double kapitalleistung = 232321.00;


        mCardAdapter.addCardItem(new Ergebnis_CardItem("Rentenleistung", rentenleistung + "€"));
        mCardAdapter.addCardItem(new Ergebnis_CardItem("Kapitalleistung", kapitalleistung + "€"));
        //mCardAdapter.addCardItem(new Ergebnis_CardItem("Details", unfallschutz.getDetails()));

        //mCardShadowTransformer = new Ergebnis_CardShadowTransformer(mViewPager, mCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        //mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);

        return view;
    }
}
