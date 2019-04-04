package fhdw.me.refu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Berechnung2Senioren extends Fragment {

    EditText editTextTag;
    EditText editTextMonat;
    EditText editTextJahr;
    EditText editTextRente;
    EditText editTextNebenjob;
    EditText editTextsonstigeEinnahmen;
    EditText editTextAlterBerufsstatrt;
    EditText editTextRentenalter;
    Button buttonContinue;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.berechnung_senior,container,false);

        buttonContinue = view.findViewById(R.id.button_continue);

        buttonContinue.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Ergebnis_SwipeData.class;
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_senior,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        return view;
    }
}
