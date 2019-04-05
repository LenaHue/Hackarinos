package fhdw.me.refu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ErgebnisFragment extends Fragment {

    private String title;
    private int page;
    private double value;
    private String stringValue;

    public static ErgebnisFragment newInstance(int page, String title, double value){
        ErgebnisFragment ergebnisFragment = new ErgebnisFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        args.putDouble("value",value);
        ergebnisFragment.setArguments(args);
        return ergebnisFragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        page=getArguments().getInt("someInt",0);
        title = getArguments().getString("someTitle");
        value = getArguments().getDouble("value");
        NumberFormat nf = new DecimalFormat("#0.00");
        try {

            stringValue = nf.format(value);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.ergebnis_adapter, container, false);
        TextView tvLabel = view.findViewById(R.id.textViewBeschreibung);
        TextView valueLabel = view.findViewById(R.id.textViewErgebnis);
        tvLabel.setText(title);
        valueLabel.setText(stringValue);
        return  view;
    }

}
