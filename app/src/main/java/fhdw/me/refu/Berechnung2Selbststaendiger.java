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

public class Berechnung2Selbststaendiger extends Fragment {

    EditText editTextTag;
    EditText editTextMonat;
    EditText editTextJahr;
    EditText editTextDurchschnittseinkommen;
    EditText editTextVolleErwerbsminrente;
    EditText editTextPrivateVorsorge;
    EditText editTextBUAbsicherung;
    Button buttonContinue;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.berechnung_selbststaendige,container,false);

        buttonContinue = view.findViewById(R.id.button_continue);
        // final EditText editText = (EditText) view.findViewById(R.id.input_TT);

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
                ft.replace(R.id.framelayout_selbststaendig,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        /*
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    editText.setHint("Placeholder");
                } else {
                    editText.setHint("");
                }
            }
        });
        */
        return view;
    }
}
