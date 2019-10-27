package com.example.dastantulokulov.m3homework2;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    Button calculate;
    IButton listener;

    Calculation calculation;

    MainAdapter adapter;
    private String DATABASE_NAME = "database";
    private String ELEMENTS_KEY = "elems";

//    static public ButtonsFragment instance(IButton listener){
//        ButtonsFragment fragment = new ButtonsFragment();
//        fragment.listener = listener;
//        return fragment;
//    }


    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences preferences = getContext().getSharedPreferences(DATABASE_NAME, 0);
        String allElements = preferences.getString(ELEMENTS_KEY, "");
        String[] elementsArray = allElements.split(",");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(elementsArray));
        adapter.setData(arrayList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}
