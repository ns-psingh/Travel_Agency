package com.example.premal2.travelagency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class enquiry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry);
        final EditText messagebtn= (EditText) findViewById(R.id.message);
        final Button send= (Button) findViewById(R.id.sendbtn);
        final TextView customermsg= (TextView) findViewById(R.id.customermsg);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customermsg.setText(customermsg.getText().toString()+"\n"+"You: "+messagebtn.getText().toString());
                messagebtn.setText("");
                Toast.makeText(getApplicationContext(),"Your message has been sent to the enquiry team. The team typically replies within minutes.Please wait for their reply.",Toast.LENGTH_LONG).show();
                }
        });
    }
}
