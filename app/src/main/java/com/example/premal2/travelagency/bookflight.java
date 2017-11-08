package com.example.premal2.travelagency;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class bookflight extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookflight);
        TextView bft=(TextView) findViewById(R.id.bookf_t1);
        TextView bf=(TextView) findViewById(R.id.bookf_fare);
        bf.setText("Flight Fare: ₹"+flightfare);
        TextView deptime=(TextView) findViewById(R.id.bookf_dtime);
        deptime.setText("Departure Time:"+(dtime/100)+":"+dtime%100);

        TextView retime=(TextView) findViewById(R.id.bookf_rtime);
        retime.setText("Arrival Time:"+rtime/100+":"+rtime%100);
        bft.setText("Flight From "+city(source)+" To "+city(dest));
        final TextView status=(TextView) findViewById(R.id.book_status);
        Button bookbtn=(Button) findViewById(R.id.bookbutton);
        FloatingActionButton back=(FloatingActionButton) findViewById(R.id.backbtn_book);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bookflight.this,flightlist.class));
            }
        });
        final NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);

        if(current.accountbal>=flightfare)
        {status.setText("");
        bookbtn.setTextColor(Color.parseColor("#000000"));
            bookbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    current.accountbal=current.accountbal-(int) flightfare;
                    for(final flightdetail p: GRAPH.graph.adjListArray[source])
                    {

                        if((p.dest==dest)&&(p.day==deptday)&&(p.departtime==dtime)&&(p.returntime==rtime))
                        {
                            p.bookings=p.bookings+1;
                            p.fare=(Integer)((p.returntime-p.departtime)*40+p.bookings*100)*1.18;
                            current.bookings.addLast(p);

                            mBuilder.setSmallIcon(R.mipmap.ic_stat_onesignal_default);
                            mBuilder.setSound(Settings.System.DEFAULT_NOTIFICATION_URI);
                            mBuilder.setContentTitle("Hey,"+current.name+"!");
                            mBuilder.setContentText("Your flight has been booked. Total ticket fare was ₹"+p.fare);
                            NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

// notificationID allows you to update the notification later on.
                            mNotificationManager.notify(0,mBuilder.build());
                        }
                    }
                    startActivity(new Intent(bookflight.this,home.class));
                }
            });
        }

    }
}
