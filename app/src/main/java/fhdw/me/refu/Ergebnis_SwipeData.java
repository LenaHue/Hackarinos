package fhdw.me.refu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class Ergebnis_SwipeData extends AppCompatActivity {

    Context context;
    private ViewPager mViewPager;
    private Ergebnis_CardPagerAdapter mCardAdapter;
    private Ergebnis_CardShadowTransformer mCardShadowTransformer;

    public Ergebnis_SwipeData activity;

    //private Unfallschutz unfallschutz;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ergebnis_adapter);

        context = this;
        activity = this;

        LayoutInflater inflater = LayoutInflater.from(activity.getApplicationContext());
        View view = inflater.inflate(R.layout.ergebnis, null);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mCardAdapter = new Ergebnis_CardPagerAdapter();

        /*mCardAdapter.addCardItem(new Ergebnis_CardItem("Rentenleistung", unfallschutz.getRentenleistung()+ "€"));
        mCardAdapter.addCardItem(new Ergebnis_CardItem("Kapitalleistung", unfallschutz.getKapitalleistung()+ "€"));
        mCardAdapter.addCardItem(new Ergebnis_CardItem("Details", unfallschutz.getDetails()));*/

        mCardAdapter.addCardItem(new Ergebnis_CardItem("Rentenleistung", "1.750€"));
        mCardAdapter.addCardItem(new Ergebnis_CardItem("Kapitalleistung", "37.000€"));

        mCardShadowTransformer = new Ergebnis_CardShadowTransformer(mViewPager, mCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);

    }


}
