package com.example.louisadort.ersteuebung;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText input;
    private Button plus;
    private Button minus;
    private Button multiplication;
    private Button division;
    private Button equals;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button delete;
    private Button coma;

    private double firstNumber;
    private double secondNumber;
    boolean add;
    boolean sub;
    boolean mul;
    boolean div;
    boolean calculateActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        result = (TextView) findViewById(R.id.result);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);
        equals = (Button) findViewById(R.id.equals);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        delete = (Button) findViewById(R.id.delete);
        coma = (Button) findViewById(R.id.coma);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add = true;
                calculateActive = true;
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub = true;
                calculateActive = true;
            }

        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mul = true;
                calculateActive = true;
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                div = true;
                calculateActive = true;
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (calculateActive == true) {
                    if (add == true) {
                        result.setText(firstNumber + secondNumber + "");
                        add = false;
                    }

                    if (sub == true) {
                        input.setText(firstNumber - secondNumber + "");
                        sub = false;
                    }

                    if (mul == true) {
                        input.setText(firstNumber * secondNumber + "");
                        mul = false;
                    }

                    if (div == true) {
                        input.setText(firstNumber / secondNumber + "");
                        div = false;
                    }
                }


            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(zero.getText() + "");
                    result.setText(firstNumber + "");
                } else {
                    secondNumber = Double.parseDouble(zero.getText() + "");
                    result.setText(secondNumber + "");
                }
            }
        });


        one.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(one.getText() + "");
                    result.setText(firstNumber + "");
                } else {
                    secondNumber = Double.parseDouble(one.getText() + "");
                    result.setText(secondNumber + "");
                }
            }
        });


        two.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(two.getText() + "");
                    result.setText(firstNumber + "");
                } else {
                    secondNumber = Double.parseDouble(two.getText() + "");
                    result.setText(secondNumber + "");
                }
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(three.getText() + "");
                    result.setText(firstNumber + "");
                } else {
                    secondNumber = Double.parseDouble(three.getText() + "");
                    result.setText(secondNumber + "");
                }
            }
        });
    }
}
    /**

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = input.getText().toString();
                result.setText(str + four.getText());
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = input.getText().toString();
                result.setText(str + five.getText());
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = input.getText().toString();
                result.setText(str + six.getText());
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = input.getText().toString();
                result.setText(str + seven.getText());
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = input.getText().toString();
                result.setText(str + eight.toString());
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = input.getText().toString();
                result.setText(str + nine.getText());
            }
        });

    }
}
         */