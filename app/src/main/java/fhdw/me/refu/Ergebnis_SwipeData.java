package fhdw.me.refu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ergebnis_SwipeData extends Fragment {

    Context context;
    private ViewPager mViewPager;
    private Ergebnis_CardPagerAdapter mCardAdapter;
    private Ergebnis_CardShadowTransformer mCardShadowTransformer;

    public Ergebnis_SwipeData activity;

    private UnfallschutzPerson unfallschutz;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.ergebnis_adapter);

        context = getContext();
        activity = this;

        LayoutInflater Lenainflater = LayoutInflater.from(activity.getContext());
        View view = Lenainflater.inflate(R.layout.ergebnis, null);

        mViewPager = (ViewPager) view.findViewById(R.id.viewPager);
        mCardAdapter = new Ergebnis_CardPagerAdapter();

        mCardAdapter.addCardItem(new Ergebnis_CardItem("Rentenleistung", unfallschutz.getRentenleistung()+ "€"));
        mCardAdapter.addCardItem(new Ergebnis_CardItem("Kapitalleistung", unfallschutz.getKapitalleistung()+ "€"));
        //mCardAdapter.addCardItem(new Ergebnis_CardItem("Details", unfallschutz.getDetails()));

        mCardShadowTransformer = new Ergebnis_CardShadowTransformer(mViewPager, mCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);

        return inflater.inflate(R.layout.ergebnis_adapter,container,false);

    }


}
