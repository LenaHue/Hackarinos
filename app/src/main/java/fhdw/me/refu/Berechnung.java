package fhdw.me.refu;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Berechnung extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        TextView header = getActivity().findViewById(R.id.toolbar_header);

        BottomNavigationView _naviagtionView = getActivity().findViewById(R.id.bottom_navigation);
        Menu _menu = _naviagtionView.getMenu();
        MenuItem _menuItem = _menu.findItem(R.id.nav_berechnung);

        //Setting Toolbar-Header
        header.setText("Berechnung");

        //Setting Menu-Item checked
        _menuItem.setChecked(true);


        return inflater.inflate(R.layout.berechnung, container, false);
    }
}
