package com.gmail.seanvisal.adapterviewstestapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;


public class SpinnerActivity extends ActionBarActivity {

    Spinner spinner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner) findViewById(R.id.email_opt);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.emailOpt_array, android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        imageView = (ImageView) findViewById(R.id.imageview1);

        // on selection change
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1,
                                       int position, long id) {

//				Toast.makeText(getApplicationContext(), "Using arg0.getItemAtPosition(arg3)\n" + arg0.getItemAtPosition((int) id).toString(), Toast.LENGTH_SHORT).show();
//				TextView textView = (TextView) arg1;
//				Toast.makeText(getApplicationContext(), "Using view arg1\n" + textView.getText().toString(), Toast.LENGTH_SHORT).show();

                //position is the row id of the item that is selected
                switch (position) {
                    case 0:
                        imageView.setImageResource(R.drawable.home);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.work);
                        break;

                    case 2:
                        imageView.setImageResource(R.drawable.other);
                        break;


                }
                imageView.invalidate();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

    }

}
