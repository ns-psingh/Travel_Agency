package com.example.premal2.travelagency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addmoney extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmoney);
        final EditText eamount=(EditText) findViewById(R.id.amount);

        final Button addmoney=(Button) findViewById(R.id.addmon);
        addmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String am=eamount.getText().toString();
                current.accountbal=current.accountbal+Integer.valueOf(am);
                startActivity(new Intent(addmoney.this,accounts_user.class));
            }
        });
    }
}
