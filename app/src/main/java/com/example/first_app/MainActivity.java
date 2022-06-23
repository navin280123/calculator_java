package com.example.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textView2;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    float mValueOne,mValueTwo;
    boolean add,sub,mul,div;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);//7
        button2 = findViewById(R.id.button2);//8
        button3 = findViewById(R.id.button3);//9
        button4 = findViewById(R.id.button4);//+
        button5 = findViewById(R.id.button5);//6
        button6 = findViewById(R.id.button6);//4
        button7 = findViewById(R.id.button7);//5
        button8 = findViewById(R.id.button8);//-
        button9 = findViewById(R.id.button9);//3
        button10 = findViewById(R.id.button10);//2
        button11 = findViewById(R.id.button11);//1
        button12 = findViewById(R.id.button12);//*
        button13 = findViewById(R.id.button13);//0
        button14 = findViewById(R.id.button14);//.
        button15 = findViewById(R.id.button15);//=
        button16 = findViewById(R.id.button16);//"/"
        button17 = findViewById(R.id.button17);//ce
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView == null){
                    textView.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(textView.getText()+"");
                    add = true;
                    textView.setText(null);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(textView.getText()+"");
                sub = true;
                textView.setText(null);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(textView.getText()+"");
                mul= true;
                textView.setText(null);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(textView.getText()+"");
                if(add == true){
                    textView.setText(mValueOne+mValueTwo+"");
                    add= false;
                }
                if(sub == true){
                    textView.setText(mValueOne-mValueTwo+"");
                    sub= false;
                }
                if(mul == true){
                    textView.setText(mValueOne*mValueTwo +"");
                    mul= false;
                }
                if(div == true) {
                    textView.setText(mValueOne / mValueTwo + "");
                    div = false;
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(textView.getText()+"");
                div = true;
                textView.setText(null);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

    }
}