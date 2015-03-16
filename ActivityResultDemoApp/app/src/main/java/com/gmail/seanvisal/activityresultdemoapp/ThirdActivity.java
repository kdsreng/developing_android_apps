package com.gmail.seanvisal.activityresultdemoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class ThirdActivity extends ActionBarActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        editText = (EditText) findViewById(R.id.edittext1);
    }


    public void okHandler(View view) {
        String inputtedText = editText.getText().toString();

        Intent data = new Intent();
        data.setData(Uri.parse(inputtedText));

        setResult(RESULT_OK, data);

        finish();
    }
}
