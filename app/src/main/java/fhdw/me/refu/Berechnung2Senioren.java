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


        return inflater.inflate(R.layout.berechnung_senior,container,false);
    }
}
