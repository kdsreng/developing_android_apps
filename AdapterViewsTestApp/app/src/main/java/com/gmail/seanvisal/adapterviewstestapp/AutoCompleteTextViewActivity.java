package com.gmail.seanvisal.adapterviewstestapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class AutoCompleteTextViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        // Get a reference to the AutoCompleteTextView in the layout
        AutoCompleteTextView textView =  (AutoCompleteTextView) findViewById(R.id.autotextview1);

        // Get the string array
        String[] provinces = getResources().getStringArray(R.array.provinces_array);

        // Create the adapter and set it to the AutoCompleteTextView
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, provinces);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, provinces);
        textView.setAdapter(adapter);

        //sets the minimum number of characters the user must type before the suggestions appear as a drop-down menu
        textView.setThreshold(2);
    }
}
