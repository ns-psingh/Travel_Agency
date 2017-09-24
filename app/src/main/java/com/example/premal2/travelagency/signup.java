package com.example.premal2.travelagency;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends MainActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        number=number+"world";
        Log.d("mytag",number);
        //This part of code is just for Android Initialisaton of various widgets

        final EditText ename=(EditText) findViewById(R.id.name);
        final EditText eemail=(EditText) findViewById(R.id.emailid);
        final EditText eusername=(EditText) findViewById(R.id.username);
        final EditText epassword=(EditText) findViewById(R.id.password);
        final EditText edob= (EditText) findViewById(R.id.dateofbirth);
        final TextView tname=(TextView) findViewById(R.id.nametext);
        final TextView temail= (TextView) findViewById(R.id.emailtext);
        final TextView tpass= (TextView) findViewById(R.id.passwordtext);
        final TextView tuser=(TextView) findViewById(R.id.usernametext);
        final TextView tdate=(TextView) findViewById(R.id.dobtext);
        ImageButton img=(ImageButton)findViewById(R.id.bckbtn);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("mytag","fk");
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
            }
        });
        Button signup=(Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name=ename.getText().toString();
                final String email=eemail.getText().toString();
                final String username=eusername.getText().toString();
                final String password=epassword.getText().toString();
                final String dob=edob.getText().toString();
                int flag=0;
                if(ename.getText().toString().trim().length() == 0) {
                    tname.setText("*Enter Your Name(Required)");
                    tname.setTextColor(0xAAFF0000);
                    flag = 1;
                }
                else
                {
                    tname.setText("Enter Your Name");
                    tname.setTextColor(0xAA3F51B5);

                }
                if(eemail.getText().toString().trim().length() == 0) {
                    temail.setText("*Enter your Email-id(Required)");
                    temail.setTextColor(0xAAFF0000);
                    flag = 1;
                }
                else
                {
                    temail.setText("Enter your Email-id");
                    temail.setTextColor(0xAA3F51B5);

                }
                if(eusername.getText().toString().trim().length() == 0) {
                    tuser.setText("*Enter your desired username(Required)");
                    tuser.setTextColor(0xAAFF0000);
                    flag = 1;
                }
                else
                {
                    tuser.setText("Enter your desired username");
                    tuser.setTextColor(0xAA3F51B5);

                }
                if(epassword.getText().toString().trim().length() == 0) {
                    tpass.setText("*Enter your desired password(Required)");
                    tpass.setTextColor(0xAAFF0000);
                    flag = 1;
                }
                else
                {
                    tpass.setText("Enter your desired passsword");
                    tpass.setTextColor(0xAA3F51B5);

                }
                if(edob.getText().toString().trim().length() == 0) {
                    tdate.setText("*Enter Date Of Birth(Required)");
                    tdate.setTextColor(0xAAFF0000);
                    flag = 1;
                }
                else
                {
                    tdate.setText("Enter Date Of Birth");
                    tdate.setTextColor(0xAA3F51B5);

                }
                if(flag==0) {
                    userinfo x = new userinfo();
                    x.setter(name,email,username,password,0,0,0);
                    if(userdb.usernamesearch(x))
                    {
                        Toast.makeText(getApplicationContext(),"Username not available!",Toast.LENGTH_SHORT).show();
                        flag=1;
                    }
                    else
                    {Toast.makeText(getApplicationContext(),"Account Created",Toast.LENGTH_SHORT).show();

                   /*try {

                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }*/
                    userdb.add(x);

                    System.out.print("\nSingly Linked List = ");
                    if (userdb.size == 0)
                    {
                        System.out.print("empty\n");
                        return;
                    }
                    if (userdb.start.getLink() == null)
                    {
                        System.out.println(userdb.start.getData().getUsername() );

                    }
                    else {
                        Node ptr = userdb.start;
                        System.out.print(userdb.start.getData().getUsername() + "->");
                        ptr = userdb.start.getLink();
                        while (ptr.getLink() != null) {
                            System.out.print(ptr.getData().getUsername() + "->");
                            ptr = ptr.getLink();
                        }
                        System.out.print(ptr.getData().getUsername() + "\n");
                    }


                    Intent intent = new Intent(signup.this, MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
                }}
                else
                {
                    Toast.makeText(getApplicationContext(),"Please fill complete details",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }

}
