package com.example.premal2.travelagency;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class accounts_user extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts_user);
        Button logoutbtn= (Button) findViewById(R.id.logoutbtn);
        TextView bal=(TextView) findViewById(R.id.balanceno);
        TextView uname=(TextView) findViewById(R.id.uname);
        uname.setText("Name: "+current.name);
        TextView udob=(TextView) findViewById(R.id.udob);
        udob.setText("Date of Birth: "+current.date);
        TextView uid=(TextView) findViewById(R.id.uid);
        uid.setText("Email: "+current.name);
        TextView uuser=(TextView) findViewById(R.id.uuser);
        uuser.setText("Username: "+current.name);
        bal.setText("₹"+current.accountbal+"");
        Button changepwd=(Button) findViewById(R.id.changepwd);
        changepwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(accounts_user.this,pwdchange.class));
            }
        });
        Button addmoneybtn=(Button) findViewById(R.id.addmoneybtn);
        addmoneybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(accounts_user.this,addmoney.class));
            }
        });
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login=0;
                current=null;
                //Toast.makeText(getApplicationContext(),"Credentials working for "+current.getUsername(),Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(accounts_user.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });
        FloatingActionButton acuser=(FloatingActionButton) findViewById(R.id.backbtnacuser);
        acuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(accounts_user.this,home.class));
            }
        });
    }
}
