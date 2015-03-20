package com.gmail.seanvisal.uiviacodetestapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    LinearLayout layout;
    EditText editText;
    ArrayList<EditText> editTextsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext_primary);
        layout = (LinearLayout) findViewById(R.id.layoutmain);

        //pre-add the primary edittext to editTextsList
        editTextsList.add(editText);
    }

    public void moreEmail(View view) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        EditText editText = new EditText(this);
        editText.setHint(getString(R.string.enter_an_email_address));
        editText.setLayoutParams(params);
        layout.addView(editText);

        editTextsList.add(editText);
    }

    public void showAll(View view) {
        String allText = "";
        for(int i=0; i<editTextsList.size(); i++){
            allText += editTextsList.get(i).getText().toString() + "\n";
        }
        Toast.makeText(this, allText, Toast.LENGTH_LONG).show();
    }

}
