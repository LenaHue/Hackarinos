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

public class Information extends Fragment {


    Button buttonRentenleistung;
    Button buttonKapitalleistung;
    Button buttonExpertenmeinungen;
    Button buttonKosten;
    Button buttonTeuer;
    Button buttonUnfallassistenzleistungen;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.informationen_kacheln, container, false);
        TextView header = getActivity().findViewById(R.id.toolbar_header);

        BottomNavigationView _naviagtionView = getActivity().findViewById(R.id.bottom_navigation);
        Menu _menu = _naviagtionView.getMenu();
        MenuItem _menuItem = _menu.findItem(R.id.nav_info);

        //Setting Toolbar-Header
        header.setText("Berechnung");

        //Setting Menu-Item checked
        _menuItem.setChecked(true);

        initButtonAndListener(view);

        return view;
    }


    public void initButtonAndListener(View view){
        buttonRentenleistung = view.findViewById(R.id.button_rentenleistungen);
        buttonKapitalleistung = view.findViewById(R.id.button_kapitalleistung);
        buttonExpertenmeinungen = view.findViewById(R.id.button_expertenmeinungen);
        buttonUnfallassistenzleistungen = view.findViewById(R.id.button_unfallassistenzleistungen);
        buttonKosten = view.findViewById(R.id.button_kosten);
        buttonTeuer = view.findViewById(R.id.button_teuer);

        buttonRentenleistung.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Information_Rentenleistung.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_informationen,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        buttonKapitalleistung.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Information_Kapitalleistung.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Selbst");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_informationen,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        buttonExpertenmeinungen.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Information_Expertenmeinungen.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Senior");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_informationen,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        buttonKosten.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Information_Kosten.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Senior");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_informationen,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        buttonTeuer.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Information_Teuer.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Senior");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_informationen,frag);
                ft.addToBackStack("tag").commit();
            }
        });

        buttonUnfallassistenzleistungen.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                Fragment frag = null;
                Class fragClass = Information_Unfallsassistenzleistungen.class;
                Bundle bundle = new Bundle();
                try{
                    frag = (Fragment) fragClass.newInstance();}
                catch (Exception e){
                    e.printStackTrace();
                }

                bundle.putString("type", "Senior");
                frag.setArguments(bundle);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout_informationen,frag);
                ft.addToBackStack("tag").commit();
            }
        });
    }

}
