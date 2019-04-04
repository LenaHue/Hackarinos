package fhdw.me.refu;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Berechnung extends Fragment {

    Button buttonAngestellt;
    Button buttonSelbststaendig;
    Button buttonSenior;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.berechnung, container, false);
        TextView header = getActivity().findViewById(R.id.toolbar_header);

        BottomNavigationView _naviagtionView = getActivity().findViewById(R.id.bottom_navigation);
        Menu _menu = _naviagtionView.getMenu();
        MenuItem _menuItem = _menu.findItem(R.id.nav_berechnung);

        //Setting Toolbar-Header
        header.setText("Berechnung");

        //Setting Menu-Item checked
        _menuItem.setChecked(true);

        initButtonAndListener(view);

        return view;
    }

    public void initButtonAndListener(View view){
        buttonAngestellt = view.findViewById(R.id.button_angestellter);
        buttonSelbststaendig = view.findViewById(R.id.button_selbststaendiger);
        buttonSenior = view.findViewById(R.id.button_senior);

        buttonAngestellt.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Berechnung2Angestellter.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Angestellter");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_berechnung,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        buttonSelbststaendig.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Berechnung2Selbststaendiger.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Selbst");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_berechnung,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        buttonSenior.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Berechnung2Senioren.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Senior");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_berechnung,frag);
                ft.addToBackStack("tag").commit();
            }
        });
    }
}
