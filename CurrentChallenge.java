package com.example.ashleymeuser.e_snap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;

public class CurrentChallenge extends AppCompatActivity {

    int currentVal;
    int currentDay;
    String[] tips;
    String currentTip;
    Intent intent;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_challenge);

        Calendar calendar = Calendar.getInstance();
        int doy = calendar.get(Calendar.DAY_OF_YEAR);
        currentDay = doy % 7;

        intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            currentVal = bundle.getInt("currentVal");


            if (currentVal == 1) {
                tips = getResources().getStringArray(R.array.heat_array);

            } else if (2 == currentVal) {
                tips = getResources().getStringArray(R.array.cool_array);
            } else if (currentVal == 4) {
                tips = getResources().getStringArray(R.array.trans_array);
            }
            /**       else if (currentVal==5){

             }
             else if (currentVal==6){

             }*/

            currentTip = tips[currentDay];
            TextView tv = (TextView) findViewById(R.id.textView11);
            tv.setText(currentTip);

        } else {

            TextView tv = (TextView) findViewById(R.id.textView11);
            tv.setText("No Current Challenge");
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void setFave(View view) {
        if (intent.getExtras() != null) {
            Intent intent1 = new Intent(view.getContext(), faveList.class);
            intent1.putExtra("currentVal", currentVal);
            intent1.putExtra("currentTip", currentTip);
            startActivity(intent1);
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("CurrentChallenge Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}


