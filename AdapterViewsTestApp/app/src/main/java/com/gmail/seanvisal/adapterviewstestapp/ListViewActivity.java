package com.gmail.seanvisal.adapterviewstestapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListViewActivity extends ActionBarActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //get reference to listview
        listView = (ListView) findViewById(R.id.listview1);

        //get string array from string resource
        final String[] presidents = getResources().getStringArray(R.array.presidents);


        // Normal list
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, presidents);


//        // Single Choice List
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, presidents);
//        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE); //make it automatically check for us


//        // Multiple Choice List
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, presidents);
//        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE); //make it automatically check for us


        //set adapter for listview
        listView.setAdapter(arrayAdapter);


        //set event onListItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), getString(R.string.toast_selected_item) + presidents[position], Toast.LENGTH_SHORT).show();

                //Toast.makeText(getApplicationContext(), getString(R.string.toast_selected_item) + 	listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void showAllSelectedItem(View view) {
        String selectedItems = getString(R.string.selected_items) + "\n";
        for (int i = 0; i < listView.getCount(); i++) {
            if (listView.isItemChecked(i)) {
                selectedItems += listView.getItemAtPosition(i) + "\n";
            }
        }
        Toast.makeText(this, selectedItems, Toast.LENGTH_LONG).show();
    }
}
