package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String oldNumber = "";
    String op = "+";
    boolean isNewOp = true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if(isNewOp)
            ed1.setText("");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.yedi_btn:
                number += "7";
                break;
            case R.id.sekiz_btn:
                number += "8";
                break;
            case R.id.dokuz_btn:
                number += "9";
                break;
            case R.id.alti_btn:
                number += "6";
                break;
            case R.id.bes_btn:
                number += "5";
                break;
            case R.id.dort_btn:
                number += "4";
                break;
            case R.id.uc_btn:
                number += "3";
                break;
            case R.id.iki_btn:
                number += "2";
                break;
            case R.id.bir_btn:
                number += "1";
                break;
            case R.id.sifir_btn:
                number += "0";
                break;

        }
        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()){
            case R.id.divide_Btn: op = "/"; break;
            case R.id.add_Btn: op = "+"; break;
            case R.id.multip_Btn: op = "*"; break;
            case R.id.sbs_Btn: op = "-"; break;
            case R.id.equal_Btn: op = "="; break;
        }
    }

    public void equalEvent(View view) {
        String new_number = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Integer.parseInt(oldNumber) + Integer.parseInt(new_number);
                break;
            case "-":
                result = Integer.parseInt(oldNumber) - Integer.parseInt(new_number);
                break;
            case "*":
                result = Integer.parseInt(oldNumber) * Integer.parseInt(new_number);
                break;
            case "/":
                result = Integer.parseInt(oldNumber) / Integer.parseInt(new_number);
                break;
        }
        ed1.setText(result+"");
    }
}