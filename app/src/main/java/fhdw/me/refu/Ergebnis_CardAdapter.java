package fhdw.me.refu;
import android.support.v7.widget.CardView;

public interface Ergebnis_CardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();

}
