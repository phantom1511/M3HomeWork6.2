package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    TextView textView;
    ArrayList<Calculation> history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView3);
        Intent intent = getIntent();
        history = (ArrayList<Calculation>) intent.getSerializableExtra("textKey");

//        ArrayList<Calculation> calculations = (ArrayList<Calculation>) intent.getSerializableExtra("textKey");
//        String s = calculations.get().first + calculations.get().oparation + calculations.get().second + calculations.get().result;
//
//        calculations.get().first;
//        calculations.get().second;
//        calculations.get().oparation;
//        calculations.get().result;
        Log.d("ron", history.get(0).first);
        textView.setText(history.get(0).first + " " + history.get(0).oparation + " " + history.get(0).second + " = " + history.get(0).result);

        TextView textView = findViewById(R.id.textView3);
        //textView.setText(String.valueOf(calculation));


        /*btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(editText.getText() + "");

                if (PLUS == true) {
                    editText.setText(Value1 + Value2 + "");
                    resultText = editText.getText().toString();
                    history.add(resultText);
                    PLUS = false;
                }


                if (MINUS == true) {
                    editText.setText(Value1 - Value2 + "");
                    resultText = editText.getText().toString();
                    history.add(resultText);
                    MINUS = false;
                }

                if (PERCENT == true) {
                    editText.setText(Value1 * Value2 / 100 + "");
                    resultText = editText.getText().toString();
                    history.add(resultText);
                    PERCENT = false;
                }

                if (DIVIDE == true) {
                    editText.setText(Value1 / Value2 + "");
                    resultText = editText.getText().toString();
                    history.add(resultText);
                    DIVIDE = false;
                }
                //adapter.addElement("textKey");
            }
        });*/

        }
}
