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

public class Berechnung2Angestellter extends Fragment {

    EditText editTextTag;
    EditText editTextMonat;
    EditText editTextJahr;
    EditText editTextBruttogehalt;
    EditText editTextNettogehalt;
    EditText editTextVollErwerbsrente;
    EditText editTextsonstEinnahmen;
    EditText editTextvollErwBU;
    Button buttonContinue;
    UnfallschutzPerson angestellter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.berechnung_angestellte1,container,false);

        buttonContinue = view.findViewById(R.id.button_continue);
        editTextTag = view.findViewById(R.id.angestellter_tag);
        editTextMonat = view.findViewById(R.id.angestellter_monat);
        editTextJahr = view.findViewById(R.id.angestellter_jahr);
        editTextBruttogehalt = view.findViewById(R.id.angestellter_bruttogehalt);
        editTextNettogehalt = view.findViewById(R.id.angestellter_nettogehalt);
        editTextVollErwerbsrente = view.findViewById(R.id.angestellter_erwerbsminderungsrente);
        editTextsonstEinnahmen = view.findViewById(R.id.angestellter_sontEinnahmen);
        editTextvollErwBU = view.findViewById(R.id.angestellter_BUA);

        angestellter = new UnfallschutzPerson(this.getArguments().getString("type"));

        buttonContinue.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Ergebnis_SwipeData.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                angestellter.setTag(Integer.parseInt(editTextTag.getText().toString()));
                angestellter.setMonat(Integer.parseInt(editTextMonat.getText().toString()));
                angestellter.setJahr(Integer.parseInt(editTextJahr.getText().toString()));
                angestellter.setAngestellterBruttogehalt(Double.parseDouble(editTextBruttogehalt.getText().toString()));
                angestellter.setAngestellterNettogehalt(Double.parseDouble(editTextNettogehalt.getText().toString()));
                angestellter.setAngestellterErwerbsminderungsrente(Double.parseDouble(editTextVollErwerbsrente.getText().toString()));
                angestellter.setAngestellterPrivateVorsorge(Double.parseDouble(editTextsonstEinnahmen.getText().toString()));
                angestellter.setAngestellterBUA(Double.parseDouble(editTextvollErwBU.getText().toString()));

                angestellter.berechnen();

                bundle.putDouble("Rentenleistung", angestellter.getRentenleistung());
                bundle.putDouble("Kapitalleistung", angestellter.getKapitalleistung());

                frag.setArguments(bundle);

                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_angestellter,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        return view;
    }
}
