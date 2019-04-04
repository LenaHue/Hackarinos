package fhdw.me.refu;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        TextView header = getActivity().findViewById(R.id.toolbar_header);

        BottomNavigationView _naviagtionView = getActivity().findViewById(R.id.bottom_navigation);
        Menu _menu = _naviagtionView.getMenu();
        MenuItem _menuItem = _menu.findItem(R.id.nav_home);

        //Setting Toolbar-Header
        header.setText("Home");

        //Setting Menu-Item checked
        _menuItem.setChecked(true);

        //Toast.makeText(getContext(), "Internet ist nicht verfügbar.", Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.home, container, false);
    }
}
