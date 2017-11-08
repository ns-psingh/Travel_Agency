package com.example.premal2.travelagency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class home extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init=1;
        final TextView name= (TextView) findViewById(R.id.name_log);
        name.setText("Welcome "+current.name+" to the Travel Agency App!");
        Button flight= (Button) findViewById(R.id.flightbtn);
        Button account= (Button) findViewById(R.id.accountbtn);
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(home.this,flightselect.class);
                intent_stack.push(intent)
                startActivity(intent_stack.peek());
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(home.this,accounts_user.class);
                intent_stack.push(intent)
                startActivity(intent_stack.peek());
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });



    }
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
}
