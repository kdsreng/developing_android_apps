package edu.zaman.activitylifecycledemoapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "In the onCreate() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "In the onCreate() method.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "In the onStart() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "In the onStart() method.");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "In the onRestart() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "In the onRestart() method.");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "In the onResume() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "In the onResume() method.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "In the onPause() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "In the onPause() method.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "In the onStop() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "In the onStop() method.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "In the onDestroy() method.", Toast.LENGTH_SHORT).show();
        Log.i(tag, "In the onDestroy() method.");
    }
}
