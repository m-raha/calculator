package com.m.rokh.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    float c = (float) 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reset=findViewById(R.id.btn_reset);
        Button zero=findViewById(R.id.btn_zero);
        Button taghsim=findViewById(R.id.btn_taghsim);
        Button mosavi=findViewById(R.id.btn_mosavi);
        Button one=findViewById(R.id.btn_one);
        Button two=findViewById(R.id.btn_two);
        Button terry=findViewById(R.id.btn_terry);
        Button plus=findViewById(R.id.btn_plus);
        Button for1=findViewById(R.id.btn_for1);
        Button five=findViewById(R.id.btn_five);
        Button sixs=findViewById(R.id.btn_sixs);
        Button mines=findViewById(R.id.btn_mines);
        Button seven=findViewById(R.id.btn_seven);
        Button eghite=findViewById(R.id.btn_eghite);
        Button nine=findViewById(R.id.btn_nine);
        Button zarb=findViewById(R.id.btn_zarb);

        final TextView tv_count=findViewById(R.id.text_count);



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_count.setText(c+"");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        taghsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mosavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        terry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        for1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sixs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        eghite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        zarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
