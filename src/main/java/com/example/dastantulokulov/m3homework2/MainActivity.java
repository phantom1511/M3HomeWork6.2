package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnP, btnDiv, btnEqual, btnDot, btnC;
    EditText editText;


    float Value1, Value2;
    boolean PLUS, MINUS, PERCENT, DIVIDE ;

    String resultText;
    ArrayList<String> history = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        adapter = new MainAdapter();
//        recyclerView.setAdapter(adapter);

        editText = findViewById(R.id.numField);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                resultText = editText.getText().toString();
            }
        });

        btn0 = (Button) findViewById(R.id.num0);
        btn1 = (Button) findViewById(R.id.num1);
        btn2 = (Button) findViewById(R.id.num2);
        btn3 = (Button) findViewById(R.id.num3);
        btn4 = (Button) findViewById(R.id.num4);
        btn5 = (Button) findViewById(R.id.num5);
        btn6 = (Button) findViewById(R.id.num6);
        btn7 = (Button) findViewById(R.id.num7);
        btn8 = (Button) findViewById(R.id.num8);
        btn9 = (Button) findViewById(R.id.num9);
        btnPlus = (Button) findViewById(R.id.BtnPlus);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMinus = (Button) findViewById(R.id.BtnMinus);
        btnP = (Button) findViewById(R.id.BtnPhr);
        btnEqual = (Button) findViewById(R.id.BtnEqual);
        btnDot = (Button) findViewById(R.id.BtnDot);
        btnC = (Button) findViewById(R.id.BtnC);
        editText = (EditText) findViewById(R.id.numField);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    Value1 = Float.parseFloat(editText.getText() + "");
                    PLUS = true;
                    editText.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(editText.getText() + "");
                MINUS = true;
                editText.setText(null);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(editText.getText() + "");
                PERCENT = true;
                editText.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(editText.getText() + "");
                DIVIDE = true;
                editText.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
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
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }

        });
    }

    public void getHistory(View view) {

//        String operation;
//
//        if (PLUS){
//            operation = "+";
//        }else if (PERCENT){
//            operation = "%";
//        }else if (MINUS){
//            operation = "-";
//        }else if (DIVIDE){
//            operation = "/";
//        }
//
//        operation = "+";

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("textKey",history);
        startActivity(intent);

    }



//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent();
//        setResult(RESULT_OK, intent);
//        finish();
//    }



    /*public void addElementToList(View view) {
        Value2 = Float.parseFloat(editText.getText() + "");

        if (PLUS == true) {
            editText.setText(Value1 + Value2 + "");
            PLUS = false;
        }


        if (MINUS == true) {
            editText.setText(Value1 - Value2 + "");
            MINUS = false;
        }

        if (PERCENT == true) {
            editText.setText(Value1 * Value2 / 100 + "");
            PERCENT = false;
        }

        if (DIVIDE == true) {
            editText.setText(Value1 / Value2 + "");
            DIVIDE = false;
        }
    }*/

}
