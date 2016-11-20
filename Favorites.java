package com.example.ashleymeuser.e_snap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class Favorites extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
 //   private GoogleApiClient client;
//    ListView listView2;
//    int currentVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
/**
        // Get ListView object from xml
        listView2 = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] options = new String[]{"",
                "Heating",
                "Cooling",
                "Water",
                "Transportation",
                "Food",
                "Appliances"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

      ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, options);
        // Assign adapter to ListView
        listView2.setAdapter(adapter2);

        // ListView Item Click Listener
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int myPosition = position;
                //          Intent intent2 = getIntent();
//                Bundle bundle = intent2.getExtras();
//                if (bundle != null) {
//                    currentVal = bundle.getInt("currentVal");
//                }

                // ListView Clicked item value
                String itemValue = (String) listView2.getItemAtPosition(position);
                Intent intent = new Intent(view.getContext(), faveList.class);
                intent.putExtra("itemPosition", myPosition);
                startActivity(intent);*/
      //      }

            //});
      //  });
    }}
