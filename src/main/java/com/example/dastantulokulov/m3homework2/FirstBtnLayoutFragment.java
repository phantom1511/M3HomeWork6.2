package com.example.dastantulokulov.m3homework2;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstBtnLayoutFragment extends Fragment {

//    Button btnC;
      Button btnHistory;
//    Button btnPlus;
//
//    EditText editText;
//
//    float Value1, Value2;
//    boolean PLUS, MINUS, PERCENT, DIVIDE;
//
      IButton listener;

    public FirstBtnLayoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_btn_layout, container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //btnHistory = getView().findViewById(R.id.fragment_first_btn_layout);

        /*btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.getHistory();
            }
        });*/

    }

    //    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        btnC = getView().findViewById(R.id.BtnC);
//        btnHistory = getView().findViewById(R.id.historyBtn);
//        btnPlus = getView().findViewById(R.id.BtnPlus);
//
//        btnC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText("");
//            }
//
//        });
//
//        btnPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (editText == null) {
//                    editText.setText("");
//                } else {
//                    Value1 = Float.parseFloat(editText.getText() + "");
//                    PLUS = true;
//                    editText.setText(null);
//                }
//            }
//        });
//
//        btnHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.getHistory();
//            }
//        });
//    }
}
