package com.gmail.seanvisal.studentinfoapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText editTextFirstName;
    EditText editTextLastName;
    EditText editTextAddress;
    RadioGroup radioGroupSex;
    RadioButton radioButtonMale;
    RadioButton radioButtonFemale;
    EditText editTextDOB;
    EditText editTextPhone;
    EditText editTextEmail;
    Spinner spinnerEmailOpt;
    Spinner spinnerPhoneOpt;


    public final static String STAFF_INFO = "Staff Info";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        editTextLastName = (EditText) findViewById(R.id.editTextLastName);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        radioGroupSex = (RadioGroup) findViewById(R.id.rgSex);
        radioButtonMale = (RadioButton) findViewById(R.id.rbMale);
        radioButtonFemale = (RadioButton) findViewById(R.id.rbFemale);
        editTextDOB = (EditText) findViewById(R.id.editTextDOB);
        editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);


        spinnerEmailOpt = (Spinner) findViewById(R.id.email_opt);
        spinnerPhoneOpt = (Spinner) findViewById(R.id.phone_opt);


        // Create an ArrayAdapter using the string array and a default spinner
        // layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.emailOpt_array,
                android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinnerEmailOpt.setAdapter(adapter);
        spinnerPhoneOpt.setAdapter(adapter);
    }

    public void sendInfo(View view) {
		String allInfo = "";
        allInfo += "Name: " + editTextLastName.getText().toString() + " " + editTextFirstName.getText().toString() + "\n";
        if(radioButtonMale.isChecked()){
            allInfo += "Sex: " + radioButtonMale.getText().toString() + "\n";
        }
        else if(radioButtonFemale.isChecked()){
            allInfo += "Sex: " + radioButtonFemale.getText().toString() + "\n";
        }

        allInfo += "Date of birth: " + editTextDOB.getText().toString() + "\n";
        allInfo += "Phone: " + editTextPhone.getText().toString() + " [" + spinnerPhoneOpt.getSelectedItem().toString() + "]\n";
        allInfo += "Email: " + editTextEmail.getText().toString() + " [" + spinnerEmailOpt.getSelectedItem().toString() + "]\n";
        allInfo += "Address: " + editTextAddress.getText().toString();


        Intent intent  = new Intent(this, StudentInfoActivity.class);
        intent.putExtra(STAFF_INFO, allInfo);
        startActivity(intent);

    }

    public void showDatePickerDialog(View v) {
        Toast.makeText(this, getString(R.string.unitl_next_time), Toast.LENGTH_SHORT).show();
    }





}
