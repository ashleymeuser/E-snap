package com.example.ashleymeuser.e_snap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;

public class Heating extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heating);

        Intent intent = getIntent();

    }


    // Defined Array values to show in ListView
    /** Called when the user clicks the Send button*/
    public void setCurrent(View view) {
        Intent intent = new Intent(this, AcceptedChallenge.class);
        intent.putExtra("currentVal", 1);
        startActivity(intent);
    }
}
