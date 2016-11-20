package com.example.ashleymeuser.e_snap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.support.design.R.styleable.MenuItem;
import static com.example.ashleymeuser.e_snap.R.id.nav_new;
import static com.google.android.gms.appindexing.AppIndex.AppIndexApi;

public class NewChallenge extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    ListView listView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client3;


    protected void onCreate() {
        onCreate();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_challenge);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent2 = getIntent();

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[]{"",
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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);
                if (itemPosition == 1) {
                    Intent intent = new Intent(view.getContext(), Heating.class);
                    startActivity(intent);
                } else if (itemPosition == 2) {
                    Intent intent = new Intent(view.getContext(), Cooling.class);
                    startActivity(intent);
                } else if (itemPosition == 3) {
                    Intent intent = new Intent(view.getContext(), Water.class);
                    startActivity(intent);
                } else if (itemPosition == 4) {
                    Intent intent = new Intent(view.getContext(), Transportation.class);
                    startActivity(intent);
                } else if (itemPosition == 5) {
                    Intent intent = new Intent(view.getContext(), Food.class);
                    startActivity(intent);
                } else if (itemPosition == 6) {
//                    Intent intent = new Intent(view.getContext(), Appliances.class);
//                    startActivity(intent);
                }

                // Show Alert
                /*Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();

            }*/


            }

        });
    }
}

