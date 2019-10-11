package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String string = intent.getStringExtra("textKey");

        ArrayList<Calculation> calculations = (ArrayList<Calculation>) intent.getSerializableExtra("textKey");

        TextView textView = findViewById(R.id.textView3);
        textView.setText(string);
    }
}
