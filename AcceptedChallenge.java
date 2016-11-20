package com.example.ashleymeuser.e_snap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class AcceptedChallenge extends AppCompatActivity {

    RelativeLayout layout;

    int currentVal;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accepted_challenge);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            currentVal = bundle.getInt("currentVal");
        }

    }

    public void changeScreen(View view){
        Intent intent = new Intent(view.getContext(), CurrentChallenge.class);
        intent.putExtra("currentVal", currentVal);
        startActivity(intent);
    }

//    layout.setOnClickListener(new View.OnClickListener())
//    {
//        public void onItemClick(View view){
//        Intent intent = new Intent(view.getContext(), CurrentChallenge.class);
//        startActivity(intent);
//    }
//    }
}

