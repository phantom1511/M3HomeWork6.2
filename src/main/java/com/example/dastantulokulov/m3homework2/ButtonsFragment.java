package com.example.dastantulokulov.m3homework2;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonsFragment extends Fragment {

    Button btnHistory;
    IButton listener;
    MainAdapter adapter;
    private String DATABASE_NAME = "database";
    private String ELEMENTS_KEY = "elems";
    EditText editText;


    public ButtonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buttons, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);

        editText = view.findViewById(R.id.editLayout);

        btnHistory = view.findViewById(R.id.historyBtn);
        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveNewElem();
            }
        });
    }

    public void saveNewElem(){
        SharedPreferences preferences = getContext().getSharedPreferences(DATABASE_NAME, 0);
        String savedString = preferences.getString(ELEMENTS_KEY, "");

        if (savedString == "") {
            savedString = editText.getText().toString();
        } else {
            savedString += "," + editText.getText().toString();
        }
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(ELEMENTS_KEY, savedString);
        editor.apply();
//        adapter.addString(editText.getText().toString());

    }

    //    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        btnHistory = getView().findViewById(R.id.historyBtn);
//
//        btnHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.getHistory();
//            }
//        });
//    }
}
