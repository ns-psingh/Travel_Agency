package com.example.premal2.travelagency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    static public int init=0;
    static public int login =0;
    static public linkL userdb=new linkL();
    static public userinfo current=new userinfo();
    static public String number="HELLO";
    static public admininbox head=new admininbox();
    static public int source;
    static public int dest;
    static public int deptday;
    static public int retday;
    static public int dtime,rtime;
    static public double flightfare;
    static public flightgraph GRAPH= new flightgraph();
    public String city(int c)
    {
        switch (c)
        {
            case 0:return ("Ahemdabad");
            case 1:return ("Bangalore");
            case 2:return ("Bombay");
            case 3:return ("Calcutta");
            case 4:return ("Chennai");
            case 5:return ("Delhi");
            case 6:return ("Hyderabad");
            case 7:return ("Indore");
            case 8:return ("Ranchi");
            case 9:return ("Goa");
        }
        return ("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mytag",number);
        //Log.d("mytag",current.username);
        if(init==0)
            head.next=head;
        final EditText euser=(EditText) findViewById(R.id.username);
        final EditText epass=(EditText) findViewById(R.id.password);
        final TextView tuser= (TextView) findViewById(R.id.usertext);
        final TextView tpass= (TextView) findViewById(R.id.passtext);
        final Button loginbtn=(Button) findViewById(R.id.login);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String usernam=euser.getText().toString();
                final String passwor=epass.getText().toString();
                int flag=0;
                if(euser.getText().toString().trim().length() == 0) {
                    tuser.setText("*Enter Username (Required)");
                    tuser.setTextColor(0xAAFF0000);
                    flag = 1;
                }
                else
                {
                    tuser.setText("Enter Username");
                    tuser.setTextColor(0xAA3F51B5);

                }

                if(epass.getText().toString().trim().length() == 0) {
                    tpass.setText("*Enter Password(Required)");
                    tpass.setTextColor(0xAAFF0000);
                    flag = 1;
                }
                else
                {
                    tpass.setText("Enter Password");
                    tpass.setTextColor(0xAA3F51B5);

                }
                if(flag==0)
                {if(userdb.credsearch(usernam,passwor))
                {
                    current=userdb.connect(usernam);
                    //Toast.makeText(getApplicationContext(),"Credentials working for "+current.getUsername(),Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(MainActivity.this,home.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                }
                else if(euser.getText().toString().equals("admin123")&&epass.getText().toString().equals("admin123"))
                {
                    startActivity(new Intent(MainActivity.this,admin.class));
                }
                }
            }
        });
        final Button signu= (Button) findViewById(R.id.signup);
        signu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login=1;
                Intent intent=new Intent(MainActivity.this, signup.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);

            }
        });
    }
    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
}
