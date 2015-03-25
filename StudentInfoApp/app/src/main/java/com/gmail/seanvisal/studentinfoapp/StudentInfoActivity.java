package com.gmail.seanvisal.studentinfoapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class StudentInfoActivity extends ActionBarActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        textView = (TextView) findViewById(R.id.textViewInfo);

        Intent intent = getIntent();
        String staff_info = intent.getStringExtra(MainActivity.STAFF_INFO);
        textView.setText(staff_info);

    }

    public void okHandler(View view) {
        finish();
    }
}
