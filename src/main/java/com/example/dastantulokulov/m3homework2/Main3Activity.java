package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    float Value1, Value2;
    boolean PLUS, MINUS, PERCENT, DIVIDE ;
    EditText editText;
    Button btnEqual;
    String resultText;
    ArrayList<String> history = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String string = intent.getStringExtra("textKey");

        ArrayList<Calculation> calculations = (ArrayList<Calculation>) intent.getSerializableExtra("textKey");
        //String s = calculations.get(0).first + calculations.get(0).oparation + calculations.get(0).second + calculations.get(0).result;

        calculations.get().first;
        calculations.get().second;
        calculations.get().oparation;
        calculations.get().result;

        TextView textView = findViewById(R.id.textView3);
        textView.setText(string);


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
