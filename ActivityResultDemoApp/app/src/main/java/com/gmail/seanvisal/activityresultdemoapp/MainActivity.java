package com.gmail.seanvisal.activityresultdemoapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextResult = (EditText) findViewById(R.id.edittext_result);
    }




    public void start2ndActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    public void start3rdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivityForResult(intent, 1001);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1001){
            if(resultCode==RESULT_OK){
                String str = data.getData().toString();
                editTextResult.setText(str);
            }
            else{
                Toast.makeText(this, "No data!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
