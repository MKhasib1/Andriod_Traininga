package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6,
            bt7, bt8, bt9, btAdd, btSubb, btDiv,
            btMul, btdot, btAc, btEqual, btMod, btCos;
    TextView Text;

    float firstNumber, secondNumber;

    boolean isAdd, isSub, isMul, isDiv, isMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btdot = (Button) findViewById(R.id.btdot);
        btAdd = (Button) findViewById(R.id.btplus);
        btSubb = (Button) findViewById(R.id.btmin);
        btMul = (Button) findViewById(R.id.btX);
        btDiv = (Button) findViewById(R.id.btdiv);
        btMod = (Button) findViewById(R.id.btmod);
        btCos = (Button) findViewById(R.id.cosX);
        btAc = (Button) findViewById(R.id.btAC);
        btEqual = (Button) findViewById(R.id.bteq);
        Text = (TextView)findViewById(R.id.Shownumber);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Text.getText().equals("0"))
                    Text.setText("0");
                else
                Text.setText(Text.getText() + "0");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("1");
                else
                Text.setText(Text.getText() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("2");
                else
                Text.setText(Text.getText() + "2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("3");
                else
                Text.setText(Text.getText() + "3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("4");
                else
                Text.setText(Text.getText() + "4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("5");
                else
                Text.setText(Text.getText() + "5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("6");
                else
                Text.setText(Text.getText() + "6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("7");
                else
                Text.setText(Text.getText() + "7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("8");
                else
                Text.setText(Text.getText() + "8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Text.getText().equals("0"))
                    Text.setText("9");
                else
                Text.setText(Text.getText() + "9");
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Text == null) {
                    Text.setText("");
                } else {
                    firstNumber = Float.parseFloat(Text.getText() + "");
                    isAdd = true;
                    Text.setText(null);
                }
            }
        });

        btSubb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(Text.getText() + "");
                isSub = true;
                Text.setText(null);
            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(Text.getText() + "");
                isMul = true;
                Text.setText(null);
            }
        });
        btMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(Text.getText() + "");
                isMod = true;
                Text.setText(null);
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(Text.getText() + "");
                isDiv = true;
                Text.setText(null);
            }
        });
btCos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
            firstNumber = (float) Math.cos(Float.parseFloat(Text.getText() + ""));
            Text.setText(firstNumber +"");
        }
        });
        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber = Float.parseFloat(Text.getText() + "");

                if (isAdd == true) {
                    Text.setText(firstNumber + secondNumber + "");
                    isAdd = false;
                }

                if (isSub == true) {
                    Text.setText(firstNumber - secondNumber + "");
                    isSub = false;
                }

                if (isMul == true) {
                    Text.setText(firstNumber * secondNumber + "");
                    isMul = false;
                }

                if (isDiv == true) {
                    Text.setText(firstNumber / secondNumber + "");
                    isDiv = false;
                }
                if(isMod ==true)
                {
                    Text.setText(firstNumber % secondNumber + "");
                    isMod =false;
                }
            }
        });

        btAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText("0");
            }
        });

        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + ".");
            }
        });
    }
}