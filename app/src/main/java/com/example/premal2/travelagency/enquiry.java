package com.example.premal2.travelagency;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class enquiry extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry);
        final EditText messagebtn= (EditText) findViewById(R.id.message);
        final Button send= (Button) findViewById(R.id.sendbtn);
        final TextView customermsg= (TextView) findViewById(R.id.customermsg);
        final TextView cnvs= (TextView) findViewById(R.id.cnvs);
        final Button adminnext= (Button) findViewById(R.id.admin_next);
        final FloatingActionButton backbtn= (FloatingActionButton) findViewById(R.id.back_enquiry);
        final Button nextenq=(Button) findViewById(R.id.admin_next);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(current!=null)
                {
                    startActivity(new Intent(enquiry.this,flightselect.class));
                }
                else
                {
                    startActivity(new Intent(enquiry.this,admin.class));
                }
            }
        });
        if(current!=null)
        {
            cnvs.setText("Conversation with Enquiry Team");
            adminnext.setVisibility(View.INVISIBLE);

            int count = current.mes.size();
            Log.d("d", count + "");
            int i = 0;

            customermsg.setText("");
            for (i = 0; i < count; i++) {
                String cur = current.mes.get(i);
                Integer ch = current.sender.get(i);
                if (ch == 1) {
                    customermsg.setText(customermsg.getText().toString() + "\n" + "You: " + cur);
                }
                if (ch == 2) {
                    customermsg.setText(customermsg.getText().toString() + "\n" + "Team: " + cur);
                }
                //customermsg.setText(customermsg.getText().toString()+"\n"+"You: "+messagebtn.getText().toString());
            }


            send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!messagebtn.getText().toString().equals("")) {

                        if (current != null) {
                            current.mes.add(messagebtn.getText().toString());
                            current.sender.add(1);
                            admininbox temp = new admininbox();

                            admininbox curr = new admininbox();
                            temp.data = current;
                            if (head.next == head) {
                                temp.next = head;
                                head.next = temp;
                            } else {
                                curr = head.next;
                                while (curr.next != head) {
                                    curr = curr.next;
                                }

                                if(curr.data.username!=temp.data.username)
                                {temp.next = head;
                                curr.next = temp;}
                            }
                            int count = current.mes.size();
                            Log.d("d", count + "");
                            int i = 0;

                            customermsg.setText("");
                            for (i = 0; i < count; i++) {
                                String cur = current.mes.get(i);
                                Integer ch = current.sender.get(i);
                                if (ch == 1) {
                                    customermsg.setText(customermsg.getText().toString() + "\n" + "You: " + cur);
                                }
                                if (ch == 2) {
                                    customermsg.setText(customermsg.getText().toString() + "\n" + "Team: " + cur);
                                }
                                //customermsg.setText(customermsg.getText().toString()+"\n"+"You: "+messagebtn.getText().toString());
                            }



                            messagebtn.setText("");
                            Toast.makeText(getApplicationContext(), "Your message has been sent to the enquiry team. The team typically replies within minutes.Please wait for their reply.", Toast.LENGTH_SHORT).show();



                        }}
                }});

        }
        else
        {
            final admininbox cur= head.next;

            cnvs.setText("Converstaion with "+cur.data.name+" ("+cur.data.username+")");

            int count=cur.data.mes.size();
            Log.d("d",count+"");
            int i=0;

            customermsg.setText("");
            for(i=0;i<count;i++)
            {
                String cur2= cur.data.mes.get(i);
                Integer ch=cur.data.sender.get(i);
                if(ch==1)
                {
                    customermsg.setText(customermsg.getText().toString()+"\n"+"Customer: "+cur2);
                }
                if(ch==2)
                {
                    customermsg.setText(customermsg.getText().toString()+"\n"+"You: "+cur2);
                }
                //customermsg.setText(customermsg.getText().toString()+"\n"+"You: "+messagebtn.getText().toString());
            }


            send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!messagebtn.getText().toString().equals("")) {

                            cur.data.mes.add(messagebtn.getText().toString());
                            cur.data.sender.add(2);

                        nextenq.setTextColor(Color.BLACK);
                        if(head.next==head)
                        {
                            startActivity(new Intent(enquiry.this,admin.class));
                        }
                        admininbox temp= new admininbox();
                        temp=head.next;
                        head.next=temp.next;
                        temp=null;
                        nextenq.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if(head.next!=head)
                                startActivity(new Intent(enquiry.this,enquiry.class));
                                else
                                    Toast.makeText(getApplicationContext(), "You don't have any messages to enquire.", Toast.LENGTH_SHORT).show();
                            }
                        });
                          //  admininbox temp = new admininbox();

                            admininbox curr = new admininbox();
                            /*temp.data = cur.data;
                            if (head.next == head) {
                                temp.next = head;
                                head.next = temp;
                            } else {
                                curr = head.next;
                                while (curr.next != head) {
                                    curr = curr.next;
                                    Log.d("tag", "fuckk");
                                }
                                if(curr.data.username!=temp.data.username)
                                {temp.next = head;
                                curr.next = temp;}
                            }*/
                            int count = cur.data.mes.size();
                            Log.d("d", count + "");
                            int i = 0;

                            customermsg.setText("");
                            for (i = 0; i < count; i++) {
                                String currr = cur.data.mes.get(i);
                                Integer ch = cur.data.sender.get(i);
                                if (ch == 1) {
                                    customermsg.setText(customermsg.getText().toString() + "\n" + "Customer: " + currr);
                                }
                                if (ch == 2) {
                                    customermsg.setText(customermsg.getText().toString() + "\n" + "You: " + currr);
                                }
                                //customermsg.setText(customermsg.getText().toString()+"\n"+"You: "+messagebtn.getText().toString());
                            }



                            messagebtn.setText("");
                          //  Toast.makeText(getApplicationContext(), "Your message has been sent to the enquiry team. The team typically replies within minutes.Please wait for their reply.", Toast.LENGTH_LONG).show();



                        }
                }});

        }

    }
}
