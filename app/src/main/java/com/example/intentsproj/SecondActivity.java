package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    TextView text01, text02, final_answer;
    Button btn_plus, btn_minus, btn_multi,btn_div;
    int num001, num002, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text01 = findViewById(R.id.textView001);
        text02 = findViewById(R.id.textView002);

        btn_plus = findViewById(R.id.button001);
        btn_minus = findViewById(R.id.button002);
        btn_multi = findViewById(R.id.button003);
        btn_div = findViewById(R.id.button004);
        final_answer = findViewById(R.id.textAnswer);

        text01.setText(getIntent().getStringExtra("NUM1"));
        text02.setText(getIntent().getStringExtra("NUM2"));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // for addition
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num001 = Integer.parseInt(text01.getText().toString());
                num002 = Integer.parseInt(text02.getText().toString());
                answer = num001 + num002;

                final_answer.setText(num001 + " + " + num002 + " = " + Integer.toString(answer));
            }
        });

        //for substraction
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num001 = Integer.parseInt(text01.getText().toString());
                num002 = Integer.parseInt(text02.getText().toString());
                answer = num001 - num002;
                final_answer.setText(num001 + " - " + num002 + " = " + Integer.toString(answer));
            }
        });

        //for multiplication
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num001 = Integer.parseInt(text01.getText().toString());
                num002 = Integer.parseInt(text02.getText().toString());
                answer = num001 * num002;
                final_answer.setText(num001 + " * " + num002 + " = " + Integer.toString(answer));
            }
        });

        //for division
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num001 = Integer.parseInt(text01.getText().toString());
                num002 = Integer.parseInt(text02.getText().toString());
                double answer1 = (double)num001 / num002;
                final_answer.setText(num001 + " / " + num002 + " = " + Double.toString(answer1));
            }
        });
    }
}