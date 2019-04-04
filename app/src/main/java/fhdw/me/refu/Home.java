package fhdw.me.refu;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends Fragment {
    Button buttonBad;
    Button buttonTuer;
    Button buttonKueche;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.home, container, false);
        TextView header = getActivity().findViewById(R.id.toolbar_header);

        BottomNavigationView _naviagtionView = getActivity().findViewById(R.id.bottom_navigation);
        Menu _menu = _naviagtionView.getMenu();
        MenuItem _menuItem = _menu.findItem(R.id.nav_home);

        //Setting Toolbar-Header
        header.setText("Home");

        //Setting Menu-Item checked
        _menuItem.setChecked(true);
        initButtonAndListener(view);
        //Toast.makeText(getContext(), "Internet ist nicht verfügbar.", Toast.LENGTH_SHORT).show();
        //toasts(view);
        return view;
    }
    public void initButtonAndListener(View view){
        buttonBad = view.findViewById(R.id.button_bad);
        buttonTuer = view.findViewById(R.id.button_tuer);
        buttonKueche = view.findViewById(R.id.button_kueche);

        buttonBad.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Höhe des WCs und Duschhilfe", Toast.LENGTH_SHORT).show();
            }
        });

        buttonTuer.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    // Perform action on click
                Toast.makeText(getContext(), "Höhe der Türgriffe und Breite der Türen", Toast.LENGTH_SHORT).show();
            }
        });

        buttonKueche.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    // Perform action on click
                Toast.makeText(getContext(), "unterfahrbare Arbeitsplatte und Tische", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
