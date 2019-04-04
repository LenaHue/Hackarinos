package fhdw.me.refu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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


        return inflater.inflate(R.layout.berechnung_selbststaendige,container,false);
    }
}
