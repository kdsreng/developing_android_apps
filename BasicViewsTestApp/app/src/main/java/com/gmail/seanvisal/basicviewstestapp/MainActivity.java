package com.gmail.seanvisal.basicviewstestapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---EditText---
        final EditText editText = (EditText) findViewById(R.id.editText1);
        editText.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //displayToast(keyCode+"");
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
                    displayToast(editText.getText().toString());
                    return true;
                }
                return false;
            }
        });


        //--Button--
        Button btnSave = (Button) findViewById(R.id.btnSave);
        ImageButton btnImg1 = (ImageButton) findViewById(R.id.btnImg1);
        Button btnSaveImg = (Button) findViewById(R.id.btnSaveImg);

        View.OnClickListener clickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                displayToast("You have clicked the Save button (" + v.getClass().getName().replace("android.widget.", "") + ")");
            }
        };

        btnSave.setOnClickListener(clickListener);
        btnImg1.setOnClickListener(clickListener);
        btnSaveImg.setOnClickListener(clickListener);



        // ---CheckBox---
        CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);
        checkBox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    displayToast("CheckBox is checked");
                else
                    displayToast("CheckBox is unchecked");
            }
        });


        // ---CheckBox Star---
        CheckBox checkBoxStar = (CheckBox) findViewById(R.id.chkStar);
        checkBoxStar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    displayToast("Star is checked");
                else
                    displayToast("Star is unchecked");
            }
        });


        // ---RadioButton---
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
                if (rb1.isChecked()) {
                    displayToast("Option 1 checked!");
                } else {
                    displayToast("Option 2 checked!");
                }
            }
        });

        // ---ToggleButton---
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle1);
        //onClick
        toggleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((ToggleButton) v).isChecked())
                    displayToast("ToggleButton is on");
                else
                    displayToast("ToggleButton is off");
            }
        });



        // ---Switch ---
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        //onClick
        switch1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((Switch) v).isChecked())
                    displayToast("Switch is On (onClick)");
                else
                    displayToast("Switch is Off (onClick)");
            }
        });
        //onCheckedChange
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView,	boolean isChecked) {
                if (isChecked) {
                    displayToast("Switch is On (onCheckedChange)");
                } else {
                    displayToast("Switch is Off (onCheckedChange)");
                }
            }
        });

    }


    private void displayToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();

    }
}
