package com.example.premal2.travelagency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    static public linkL userdb=new linkL();
    static public String number="HELLO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mytag",number);
        final EditText euser=(EditText) findViewById(R.id.username);
        final EditText epass=(EditText) findViewById(R.id.password);
        final Button loginbtn=(Button) findViewById(R.id.login);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String usernam=euser.getText().toString();
                final String passwor=epass.getText().toString();
                if(userdb.credsearch(usernam,passwor))
                {
                    Toast.makeText(getApplicationContext(),"Credentials working for "+usernam,Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button signu= (Button) findViewById(R.id.signup);
        signu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
