package com.example.premal2.travelagency;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class admin extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        init=1;
        admininbox cur=new admininbox();
        if(head.next!=head)
        {
            Log.d("tag","lol");
            if(head.next.next!=head)
                Log.d("tag","lolol");
            cur=head;
            int count=0;
            while(cur.next!=head)
            {
                count++;
                cur=cur.next;
            }
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
            mBuilder.setSmallIcon(R.mipmap.ic_stat_onesignal_default);
            mBuilder.setSound(Settings.System.DEFAULT_NOTIFICATION_URI);
            mBuilder.setContentTitle("Hey, Administrator!");
            mBuilder.setContentText("You have "+count+" pending messages to enquire.");
            NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

// notificationID allows you to update the notification later on.
            mNotificationManager.notify(0,mBuilder.build());

        }
        Button manage= (Button) findViewById(R.id.adminenq);
        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(head.next!=head)
                startActivity(new Intent(admin.this,enquiry.class));
                else
                    Toast.makeText(getApplicationContext(), "You don't have any messages to enquire.", Toast.LENGTH_SHORT).show();
            }
        });


        Button logout= (Button) findViewById(R.id.adminlogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin.this,MainActivity.class));
            }
        });
    }
}
