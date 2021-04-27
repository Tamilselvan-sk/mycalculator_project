package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }

    public void btnADD(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int sum = n1 + n2;
        tvResult.setText(String.valueOf(sum));

    }

    public void btnSUB(View view) {int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int sum = n1 - n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btnMULTI(View view) {int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int sum = n1 * n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btnDIV(View view) {int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int sum = n1 / n2;
        tvResult.setText(String.valueOf(sum));
    }
}