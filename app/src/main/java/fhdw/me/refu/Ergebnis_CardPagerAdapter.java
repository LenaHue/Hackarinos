package fhdw.me.refu;

import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Ergebnis_CardPagerAdapter extends PagerAdapter implements Ergebnis_CardAdapter {

    private List<CardView> mViews;
    private List<Ergebnis_CardItem> mData;
    private float mBaseElevation;

    public Ergebnis_CardPagerAdapter() {
        mData = new ArrayList<>();
        mViews = new ArrayList<>();
    }

    public void addCardItem(Ergebnis_CardItem item) {
        mViews.add(null);
        mData.add(item);
    }

    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {
        return mViews.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.ergebnis_adapter, container, false);
        //container.addView(view);
        //bind(mData.get(position), view);

        TextView beschreibung, ergebnis, intervall;

        beschreibung = view.findViewById(R.id.textViewBeschreibung);
        ergebnis = view.findViewById(R.id.textViewErgebnis);
        intervall = view.findViewById(R.id.textViewIntervall);

        beschreibung.setText("Rentenleistung");
        ergebnis.setText("300");
        intervall.setText("mtl.");


        container.addView(view);

        /*CardView cardView = (CardView) view.findViewById(R.id.Ergebnis_CardView);

        if (mBaseElevation == 0) {
            mBaseElevation = cardView.getCardElevation();
        }



        cardView.setMaxCardElevation(mBaseElevation * MAX_ELEVATION_FACTOR);
        mViews.set(position, cardView);*/
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        mViews.set(position, null);
    }

    private void bind(Ergebnis_CardItem item, View view) {
        TextView titleTextView = (TextView) view.findViewById(R.id.textViewBeschreibung);
        TextView contentTextView = (TextView) view.findViewById(R.id.textViewErgebnis);
        titleTextView.setText(item.getTitle());
        contentTextView.setText(item.getText());
    }

}
