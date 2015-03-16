package com.gmail.seanvisal.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    public static final String MY_KEY_EXTRA = "abc6652345235";

    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext_message);


    }




    public void sendMessage(View view) {

        Toast.makeText(this, getString(R.string.message_sent), Toast.LENGTH_LONG).show();

        //get the inputted text
        String inputtedText = "";
        inputtedText = editText.getText().toString();

        //open new Activity & send the text to it
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(MY_KEY_EXTRA, inputtedText);
        startActivity(intent);
    }
}
