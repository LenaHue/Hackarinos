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
    UnfallschutzPerson senior;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.berechnung_senior,container,false);

        buttonContinue = view.findViewById(R.id.button_continue);
         editTextTag = view.findViewById(R.id.senior_tag);
         editTextMonat = view.findViewById(R.id.senior_monat);
         editTextJahr = view.findViewById(R.id.senior_jahr);
         editTextRente = view.findViewById(R.id.senior_rente);
         editTextNebenjob = view.findViewById(R.id.senior_nebenjob);
         editTextsonstigeEinnahmen = view.findViewById(R.id.senior_sonstEinnahmen);
         editTextAlterBerufsstatrt = view.findViewById(R.id.senior_alterStart);
         editTextRentenalter = view.findViewById(R.id.senior_renteneintritt);

         senior = new UnfallschutzPerson(this.getArguments().getString("type"));

        buttonContinue.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Ergebnis.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                senior.setTag(Integer.parseInt(editTextTag.getText().toString()));
                senior.setMonat(Integer.parseInt(editTextMonat.getText().toString()));
                senior.setJahr(Integer.parseInt(editTextJahr.getText().toString()));
                senior.setSeniorRente(Double.parseDouble(editTextRente.getText().toString()));
                senior.setSeniorNebenjob(Double.parseDouble(editTextNebenjob.getText().toString()));
                senior.setSeniorEinnahmen(Double.parseDouble(editTextsonstigeEinnahmen.getText().toString()));
                senior.setSeniorAlterStart(Integer.parseInt(editTextAlterBerufsstatrt.getText().toString()));
                senior.setSeniorRenteneintritt(Integer.parseInt(editTextRentenalter.getText().toString()));

                senior.berechnen();

                bundle.putDouble("Rentenleistung", senior.getRentenleistung());
                bundle.putDouble("Kapitalleistung", senior.getKapitalleistung());

                frag.setArguments(bundle);

                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_senior,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        return view;
    }
}
