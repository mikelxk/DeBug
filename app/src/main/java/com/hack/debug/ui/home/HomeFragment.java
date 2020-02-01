package com.hack.debug.ui.home;

import android.os.Bundle;
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

import com.hack.debug.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public HomeFragment(){
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        String[] myList = {"help","me","k"};
        ListView listView = (ListView) view.findViewById(R.id.showList);
        ArrayAdapter<String> liveViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                myList
        );
        listView.setAdapter(liveViewAdapter);
        return view;
    }
}