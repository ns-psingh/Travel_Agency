package com.example.premal2.travelagency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pwdchange extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwdchange);
        final EditText eold=(EditText) findViewById(R.id.oldpw);
        final EditText enewp=(EditText) findViewById(R.id.pw1);
        final EditText enewp2=(EditText) findViewById(R.id.pw2);

        Button change=(Button) findViewById(R.id.changepwd);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String old=eold.getText().toString();
                String new1=enewp.getText().toString();
                String new2=enewp2.getText().toString();
                if(old.equals(current.getPassword()))
                {
                    if(!new1.equals(""))
                    {
                        if(!new2.equals(""))
                        {
                            if(new1.equals(new2))
                            {
                                current.password=new1;
                                Toast.makeText(getApplicationContext(), "Password changed", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(pwdchange.this,accounts_user.class));
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "Please complete new password", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Please complete new password", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Old password did not match!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
