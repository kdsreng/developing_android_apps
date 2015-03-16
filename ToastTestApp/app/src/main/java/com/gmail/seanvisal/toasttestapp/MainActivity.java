package com.gmail.seanvisal.toasttestapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gmail.seanvisal.toasttestapp.R;

public class MainActivity extends ActionBarActivity {

    EditText edit01;
    EditText edit02;

    EditText editTextX, editTextY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextX = (EditText) findViewById(R.id.edit01);
        editTextY = (EditText) findViewById(R.id.edit02);
    }


    public void onClickBasicToast(View view){
        Toast.makeText(this, "Basic Toast", Toast.LENGTH_SHORT).show();

    }

    public void onClickPositionedToast(View view){

        int xOffset = Integer.parseInt(editTextX.getText().toString());
        int yOffset = Integer.parseInt(editTextY.getText().toString());

        Toast toast = Toast.makeText(this, "Positioned Toast", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, xOffset, yOffset);
        toast.show();

    }

}
