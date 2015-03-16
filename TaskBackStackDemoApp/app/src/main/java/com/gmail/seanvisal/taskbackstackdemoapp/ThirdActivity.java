package com.gmail.seanvisal.taskbackstackdemoapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class ThirdActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void startActivity4Handler(View view) {
//        Intent intent = new Intent(this, FourthActivity.class);
//        startActivity(intent);
    }
}
