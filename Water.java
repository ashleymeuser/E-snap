package com.example.ashleymeuser.e_snap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Water extends AppCompatActivity {

    protected void onCreate(){
        onCreate();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        Intent intent = getIntent();
    }

    // Defined Array values to show in ListView
    /** Called when the user clicks the Send button*/
    public void setCurrent(View view) {
        Intent intent = new Intent(this, AcceptedChallenge.class);
        intent.putExtra("currentVal", 3);
        startActivity(intent);
    }
}
