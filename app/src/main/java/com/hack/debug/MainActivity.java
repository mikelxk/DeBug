package com.hack.debug;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.hack.debug.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListView simpleList;
    List list = new ArrayList();
    ArrayAdapter adapter;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


        listView = (ListView)findViewById(R.id.showList);
        testAddList();//test add a item
        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }
//    public void addContent(ArrayList addList){
//        list.addAll(addList);
//    }
    public boolean testAddList(){
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        list.add("orange");
        return true;
    }

}
