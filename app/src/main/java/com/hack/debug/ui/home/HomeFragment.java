package com.hack.debug.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;


import com.google.android.gms.maps.MapsInitializer;
import com.hack.debug.Main2Activity;

import com.google.android.gms.maps.SupportMapFragment;

import com.hack.debug.R;

import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;


public class HomeFragment extends Fragment implements OnMapReadyCallback{

    private HomeViewModel homeViewModel;
    GoogleMap mGooglemap;
    MapView mMapview;
    View view;
    public ArrayList<String> myList = new ArrayList<String>();
    public HomeFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listView = (ListView) view.findViewById(R.id.showList);

        listAddList(new ArrayList<String>(){
            {
                add("Testing 1");
                add("Testing 2");
            }

        });
        ArrayAdapter<String> liveViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                myList
        );
        listView.setAdapter(liveViewAdapter);

        return view;
    }
    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        mMapview=(MapView)view.findViewById(R.id.mapView);
        if(mMapview!=null){
            mMapview.onCreate(null);
            mMapview.onResume();
            mMapview.getMapAsync(this);
        }
    }
    public void onMapReady(GoogleMap googleMap){
        MapsInitializer.initialize(getContext());
        mGooglemap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void listAdd(String s){
        myList.add(s);
    }
    public void listAddList(ArrayList<String> als){
        myList.addAll(als);
    }



}