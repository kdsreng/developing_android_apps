package com.gmail.seanvisal.activitylifecycletestapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class SecondActivity extends ActionBarActivity {

    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "Activity Two onCreate() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity Two onCreate() method.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity Two onStart() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity Two onStart() method.");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Activity Two onRestart() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity Two onRestart() method.");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Two onResume() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity Two onResume() method.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity Two onPause() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity Two onPause() method.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity Two onStop() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity Two onStop() method.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity Two onDestroy() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity Two onDestroy() method.");
    }

    public void closeHandler(View view) {
        finish();
    }
}
