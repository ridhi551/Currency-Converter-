package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void changeCurrency(View v){

        Log.i("Info" , "Check");
        EditText inputCurrency = (EditText) findViewById(R.id.editTextNumber);
        EditText calCurrency = (EditText) findViewById(R.id.editTextTextPersonName2);

        String s = inputCurrency.getText().toString();
        double dollar = Double.parseDouble(s);
        double rupees = dollar*74.28d;

        String stringRupees = Double.toString(rupees);


        Toast.makeText(this, "Amount in INR: " + stringRupees, Toast.LENGTH_LONG).show();
        calCurrency.setText("Amount in INR: " + rupees);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}