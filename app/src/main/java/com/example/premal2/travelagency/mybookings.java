package com.example.premal2.travelagency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mybookings extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mybookings);
        TextView bookings[]=new TextView[5];
        bookings[0]=(TextView) findViewById(R.id.booking1);
        bookings[0].setText("");
        bookings[1]=(TextView) findViewById(R.id.booking2);
        bookings[1].setText("");
        bookings[2]=(TextView) findViewById(R.id.booking3);
        bookings[2].setText("");
        bookings[3]=(TextView) findViewById(R.id.booking4);
        bookings[3].setText("");
        bookings[4]=(TextView) findViewById(R.id.booking5);
        bookings[4].setText("");
        int i=0;
        for(final flightdetail p: current.bookings)
        {
            bookings[i].setText(p.departtime);
            i++;
        }

    }
}
