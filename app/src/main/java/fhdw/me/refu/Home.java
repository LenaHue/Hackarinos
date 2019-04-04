package fhdw.me.refu;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends Fragment {

    Button buttonSchlafzimmer;
    Button buttonFlur;
    Button buttonWohnzimmer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.home, container, false);

        TextView header = getActivity().findViewById(R.id.toolbar_header);

        BottomNavigationView _naviagtionView = getActivity().findViewById(R.id.bottom_navigation);
        Menu _menu = _naviagtionView.getMenu();
        MenuItem _menuItem = _menu.findItem(R.id.nav_home);

        //Setting Toolbar-Header
        header.setText("Home");

        //Setting Menu-Item checked
        _menuItem.setChecked(true);

        //Toast.makeText(getContext(), "Internet ist nicht verfügbar.", Toast.LENGTH_SHORT).show();
        initButtonAndListener(view);

        return view ;
    }

    public void initButtonAndListener(View view){

        buttonSchlafzimmer = view.findViewById(R.id.buttonSchlafzimmer);
        buttonFlur = view.findViewById(R.id.buttonFlur);
        buttonWohnzimmer = view.findViewById(R.id.buttonWohnzimmer);

        buttonSchlafzimmer.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Räume sollten großzügig bemessen sein", Toast.LENGTH_SHORT).show();
            }
        });
        //kommentar

        buttonFlur.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Treppen und einzelne Stufen sollten mit Rampen oder Treppenliften überbrückt werden können", Toast.LENGTH_SHORT).show();
            }
        });

        buttonWohnzimmer.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Die Böden müssen rutschfrei sein", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
