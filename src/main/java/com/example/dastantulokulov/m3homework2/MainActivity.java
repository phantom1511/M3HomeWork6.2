package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements IButton{

    FirstBtnLayoutFragment firstBtnLayoutFragment;
    RecyclerViewFragment recyclerViewFragment;
    ButtonsFragment buttonsFragment;
    /*SecondBtnLayoutFragment secondBtnLayoutFragment;
    ThirdBtnLayoutFragment thirdBtnLayoutFragment;
    FourthBtnLayoutFragment fourthBtnLayoutFragment;
    FifthBtnLayoutFragment fifthBtnLayoutFragment;
    EditTextFragment editTextFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBtnLayoutFragment = (FirstBtnLayoutFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_first_btn_layout);
        secondBtnLayoutFragment = (SecondBtnLayoutFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_second_btn_layout);
        thirdBtnLayoutFragment = (ThirdBtnLayoutFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_third_btn_layout);
        fourthBtnLayoutFragment = (FourthBtnLayoutFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_fourth_btn_layout);
        fifthBtnLayoutFragment = (FifthBtnLayoutFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_fifth_btn_layout);
        editTextFragment = (EditTextFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_edit_layout);
    }
    @Override
    public void getHistory() {

    }*/


    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnP, btnDiv, btnEqual, btnDot, btnC, historyBtn;
    EditText editText;


    float Value1, Value2;
    boolean PLUS, MINUS, PERCENT, DIVIDE;

    String resultText;
    ArrayList<Calculation> history = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //firstBtnLayoutFragment = (FirstBtnLayoutFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_first_btn_layout);

        //firstBtnLayoutFragment.listener = this;

        buttonsFragment = (ButtonsFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_buttons);
        recyclerViewFragment = (RecyclerViewFragment) getSupportFragmentManager().findFragmentById(R.id.recyclerView);


        buttonsFragment.listener = this;


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
                Calculation calculation = new Calculation();
                Value2 = Float.parseFloat(editText.getText() + "");
                if (PLUS == true) {
                    editText.setText(Value1 + Value2 + "");
                    resultText = editText.getText().toString();
                    calculation.first = String.valueOf(Value1);
                    calculation.second = String.valueOf(Value2);
                    calculation.operation = "+";
                    calculation.result = resultText;
                    history.add(calculation);
                    PLUS = false;
                }


                if (MINUS == true) {
                    editText.setText(Value1 - Value2 + "");
                    resultText = editText.getText().toString();
                    calculation.first = String.valueOf(Value1);
                    calculation.second = String.valueOf(Value2);
                    calculation.operation = "-";
                    calculation.result = resultText;
                    history.add(calculation);
                    MINUS = false;
                }

                if (PERCENT == true) {
                    editText.setText(Value1 * Value2 / 100 + "");
                    resultText = editText.getText().toString();
                    calculation.first = String.valueOf(Value1);
                    calculation.second = String.valueOf(Value2);
                    calculation.operation = "%";
                    calculation.result = resultText;
                    history.add(calculation);
                    PERCENT = false;
                }

                if (DIVIDE == true) {
                    editText.setText(Value1 / Value2 + "");
                    resultText = editText.getText().toString();
                    calculation.first = String.valueOf(Value1);
                    calculation.second = String.valueOf(Value2);
                    calculation.operation = "/";
                    calculation.result = resultText;
                    history.add(calculation);
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

    /*public void getHistory(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("textKey", history);
        startActivity(intent);

    }*/



//    public void getHistory(View view) {
//        Fragment fragment = null;
//
//        switch (view.getId()) {
//            case R.id.historyBtn:
//                fragment = new RecyclerViewFragment();
//                break;
//            case R.id.calculatorBtn:
//                fragment = new ButtonsFragment();
//                break;
//        }
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.recyclerView, fragment);
//        fragmentTransaction.commit();
//    }


    @Override
    public void getHistory() {
        showHistory(RecyclerViewFragment.instance(this));
    }

    @Override
    public void calculate() {
        showCalculator(new ButtonsFragment());
    }

    public void showHistory(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }

    public void showCalculator(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.recyclerView, fragment);
        transaction.commit();
    }

}
