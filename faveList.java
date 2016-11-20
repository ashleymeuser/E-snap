package com.example.ashleymeuser.e_snap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class faveList extends AppCompatActivity {
    ArrayList<String> heatFaves = new ArrayList<String>();
    ArrayList<String> coolFaves = new ArrayList<String>();
    ArrayList<String> waterFaves = new ArrayList<String>();
    ArrayList<String> transFaves = new ArrayList<String>();
    ArrayList<String> foodFaves = new ArrayList<String>();
    ArrayList<String> appFaves = new ArrayList<String>();

    int thisVal;
    String myString;
    ArrayList<String> currList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fave_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//
        thisVal=0;
        Intent intention = getIntent();
        Bundle bundler = intention.getExtras();
        if (bundler != null) {
            thisVal = bundler.getInt("currentVal");
        }
        if (thisVal == 1) {
            currList = heatFaves;
            myString = "Heating Tips";
        } else if (thisVal == 2) {
            currList = coolFaves;
            myString = "Cooling Tips";
        } else if (thisVal == 3) {
            currList = waterFaves;
            myString = "Water Tips";
        } else if (thisVal == 4) {
            currList = transFaves;
            myString = "Transportation Tips";
        } else if (thisVal == 5) {
            currList = foodFaves;
            myString = "Food Tips";
        } else if (thisVal == 6) {
            currList = appFaves;
            myString = "Appliance Tips";
        }
        if (currList == null) {
            TextView tv1 = (TextView) findViewById(R.id.textView17);
            tv1.setText("Favorite Tips");
            TextView tv2 = (TextView) findViewById(R.id.textView20);
            tv2.setText("Choose this challenge and add to your favorite tips.");
        } else {
            TextView tv1 = (TextView) findViewById(R.id.textView17);
            tv1.setText(myString);
            TextView tv2 = (TextView) findViewById(R.id.textView20);
            tv2.setText("Choose this challenge and add to your favorite tips.");
        }

    }

    public void populateArray(int arrayNum, String newTip){
        if (arrayNum==1 && !heatFaves.contains(newTip)) {
            heatFaves.add(newTip);
        } else if (arrayNum==2&& !coolFaves.contains(newTip)) {
            coolFaves.add(newTip);
        }
        else if (arrayNum==3&& !waterFaves.contains(newTip)) {
            waterFaves.add(newTip);
        }else if (arrayNum==4&& !transFaves.contains(newTip)) {
            transFaves.add(newTip);
        }
        else if (arrayNum==5&& !foodFaves.contains(newTip)) {
            foodFaves.add(newTip);
        }
        else if (arrayNum==6&& !appFaves.contains(newTip)) {
            appFaves.add(newTip);
        }
    }
}
