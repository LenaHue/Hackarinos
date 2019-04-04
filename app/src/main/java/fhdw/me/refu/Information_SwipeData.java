package fhdw.me.refu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class Information_SwipeData extends AppCompatActivity {

    Context context;
    private ViewPager mViewPager;
    private Information_CardPagerAdapter mCardAdapter;
    private Information_CardShadowTransformer mCardShadowTransformer;

    public Information_SwipeData activity;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_adapter);

        context = this;
        activity = this;

        LayoutInflater inflater = LayoutInflater.from(activity.getApplicationContext());
        View view = inflater.inflate(R.layout.information, null);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mCardAdapter = new Information_CardPagerAdapter();

        mCardAdapter.addCardItem(new Information_CardItem("Information", "bla"));
        mCardAdapter.addCardItem(new Information_CardItem("Information", "bla"));

        mCardShadowTransformer = new Information_CardShadowTransformer(mViewPager, mCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);

    }


}
