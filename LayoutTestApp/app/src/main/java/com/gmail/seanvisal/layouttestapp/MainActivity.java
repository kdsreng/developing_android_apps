package com.gmail.seanvisal.layouttestapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void showFrameLayout(View view){
        Intent intent = new Intent(this, FrameLayoutActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), R.string.toast_frame, Toast.LENGTH_SHORT).show();

    }

    public void showLinearLayout(View view){
        int whichButton = view.getId();
        Intent intent;
        if(findViewById(R.id.button_linear_h).getId()== whichButton)
            intent = new Intent(getApplicationContext(), LinearLayoutActivity.class);
        else
            intent = new Intent(getApplicationContext(), LinearLayoutVerticalActivity.class);


        Toast.makeText(getApplicationContext(), R.string.toast_linear, Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }


    public void showRelativeLayout(View view){
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), R.string.toast_relative, Toast.LENGTH_SHORT).show();

    }



    public void showSrollView(View view){
        Intent intent = new Intent(this, SrollViewActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), R.string.toast_scrollview, Toast.LENGTH_SHORT).show();

    }
}
