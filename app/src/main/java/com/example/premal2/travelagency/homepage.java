package com.example.premal2.travelagency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class homepage extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        final TextView t=(TextView) findViewById(R.id.message);
        t.setText("Welcome "+current.name+"! The App is under construction");
    }
}
