package com.simonwebtech.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Method to convert Dollars to Yuan
    public void dollarToYuan (View view) {

        try {

            EditText dollar = (EditText) findViewById(R.id.dollarNumber);
            String dollarNumberString = dollar.getText().toString();

            double dollarN = Double.parseDouble(dollarNumberString);

            double convertedNum = dollarN * 6.7;
            convertedNum = Math.round(convertedNum);

            TextView tv = (TextView)findViewById(R.id.yuanFinal);
            tv.setText(convertedNum + " Yuan");

        }
        catch (NumberFormatException e) {

            Toast.makeText(getApplicationContext(), "Please enter a number!", Toast.LENGTH_LONG).show();
        }

    }

    //Method to convert Yuan to Dollars
    public void yuanToDollar (View view) {

        try {

            EditText yuan = (EditText) findViewById(R.id.yuanNumber);
            String yuanNumberString = yuan.getText().toString();

            double yuanNum = Double.parseDouble(yuanNumberString);

            double convertedNum = yuanNum / 6.7;
            convertedNum = Math.round(convertedNum);

            TextView tv = (TextView)findViewById(R.id.dollarFinal);
            tv.setText(convertedNum + " Dollars");

        }
        catch (NumberFormatException e) {

            Toast.makeText(getApplicationContext(), "Please enter a number!", Toast.LENGTH_LONG).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
