package com.gmail.seanvisal.temperatureconverter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public static final String PREV_RESULT_KEY = "PrevResult";
    EditText editTextDegree;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextDegree = (EditText) findViewById(R.id.edittext_degree);
        textViewResult = (TextView) findViewById(R.id.textview_result);

        //restore previous result
        if(savedInstanceState!=null)
            textViewResult.setText(savedInstanceState.getString(PREV_RESULT_KEY));
    }


    public void onClickC2F(View view) {
        double celsius  = 0.0;
        double fahrenheit = 0.0;
        celsius = Double.parseDouble(editTextDegree.getText().toString());
        fahrenheit = (9.0 / 5.0) * celsius + 32;


        String formatResult = String.format("%.02f", fahrenheit);

        textViewResult.setText(formatResult + " " + ((char) 0x00B0) + "F");
        //textViewResult.setText(celsius + " " + ((char) 0x00B0) + "C" + " = " +formatResult + " " + ((char) 0x00B0) + "F");

        Toast.makeText(this, "Celsius to Fahrenheit", Toast.LENGTH_SHORT).show();
    }

    public void onClickF2C(View view) {
        double celsius  = 0.0;
        double fahrenheit = 0.0;
        fahrenheit = Double.parseDouble(editTextDegree.getText().toString());
        celsius = (5.0 / 9.0) * (fahrenheit - 32);

        String formatResult = String.format("%.02f", celsius);
        textViewResult.setText(formatResult + " " + ((char) 0x00B0) + "C");
        //textViewResult.setText(fahrenheit + " " + ((char) 0x00B0) + "F" + " = " +formatResult + " " + ((char) 0x00B0) + "C");
        Toast.makeText(this, "Fahrenheit to Celsius", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(PREV_RESULT_KEY, textViewResult.getText().toString());
    }
}
