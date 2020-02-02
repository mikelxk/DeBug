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

import com.hack.debug.Main2Activity;
import com.hack.debug.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public ArrayList<String> myList = new ArrayList<String>();
    public HomeFragment(){
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
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
    public void listAdd(String s){
        myList.add(s);
    }
    public void listAddList(ArrayList<String> als){
        myList.addAll(als);
    }



}