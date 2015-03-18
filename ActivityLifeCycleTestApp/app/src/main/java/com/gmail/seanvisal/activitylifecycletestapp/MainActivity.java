package com.gmail.seanvisal.activitylifecycletestapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Activity One onCreate() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity One onCreate() method.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity One onStart() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity One onStart() method.");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Activity One onRestart() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity One onRestart() method.");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity One onResume() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity One onResume() method.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity One onPause() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity One onPause() method.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity One onStop() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity One onStop() method.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity One onDestroy() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "Activity One onDestroy() method.");
    }

    public void startActivityTowHandler(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
