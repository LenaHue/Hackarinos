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
    UnfallschutzPerson selbst;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.berechnung_selbststaendige,container,false);

        buttonContinue = view.findViewById(R.id.button_continue);
        editTextTag = view.findViewById(R.id.selbst_tag);
        editTextMonat = view.findViewById(R.id.selbst_monat);
        editTextJahr = view.findViewById(R.id.selbst_jahr);
        editTextDurchschnittseinkommen = view.findViewById(R.id.selbst_durchnettoeinkommen);
        editTextVolleErwerbsminrente = view.findViewById(R.id.selbst_vollerwerbsrente);
        editTextPrivateVorsorge = view.findViewById(R.id.selbst_privateVororge);
        editTextBUAbsicherung = view.findViewById(R.id.selbst_bua);




        selbst = new UnfallschutzPerson(this.getArguments().getString("type"));

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

                selbst.setTag(Integer.parseInt(editTextTag.getText().toString()));
                selbst.setMonat(Integer.parseInt(editTextMonat.getText().toString()));
                selbst.setJahr(Integer.parseInt(editTextJahr.getText().toString()));
                selbst.setSelbststaendigNettoeinnahmen(Double.parseDouble(editTextDurchschnittseinkommen.getText().toString()));
                selbst.setSelbststaendigErwerbsminderungsrente(Double.parseDouble(editTextVolleErwerbsminrente.getText().toString()));
                selbst.setSelbststaendigPrivateVorsorge(Double.parseDouble(editTextPrivateVorsorge.getText().toString()));
                selbst.setSelbststaendigBUA(Double.parseDouble(editTextPrivateVorsorge.getText().toString()));

                selbst.berechnen();
                bundle.putDouble("Rentenleistung",selbst.getRentenleistung());
                bundle.putDouble("Kapitalleistung",selbst.getKapitalleistung());

                frag.setArguments(bundle);

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
