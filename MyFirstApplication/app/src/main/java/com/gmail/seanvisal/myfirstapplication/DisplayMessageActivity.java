package com.gmail.seanvisal.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MY_KEY_EXTRA);


        textView = (TextView) findViewById(R.id.textview_display);
        textView.setText(message);

    }



}
