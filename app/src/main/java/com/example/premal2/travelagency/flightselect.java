package com.example.premal2.travelagency;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Source;

public class flightselect extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flightselect);
        final Spinner spinner = (Spinner) findViewById(R.id.from_city);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(flightselect.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.country_arrays));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);

        spinner.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final Spinner spinner2 = (Spinner) findViewById(R.id.to_city);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(flightselect.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.country_arrays));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(myAdapter2);

        spinner2.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final Spinner spinner3 = (Spinner) findViewById(R.id.departday);
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(flightselect.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.days));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(myAdapter3);

        spinner3.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final Spinner spinner4 = (Spinner) findViewById(R.id.returnday);
        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(flightselect.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.days));
        myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(myAdapter4);

        spinner4.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        FloatingActionButton fab=(FloatingActionButton) findViewById(R.id.enquirybtn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("mytag","5");
               startActivity(new Intent(view.getContext(), enquiry.class));
            }
        });
        final Switch s= (Switch) findViewById(R.id.sw);
        final TextView l=(TextView) findViewById(R.id.returntv);
        final FloatingActionButton back= (FloatingActionButton) findViewById(R.id.backbtnfs);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(flightselect.this,home.class));
            }
        });

        l.setVisibility(View.INVISIBLE);
        spinner4.setVisibility(View.INVISIBLE);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.isChecked())
                {
                    TextView l1=(TextView) findViewById(R.id.returntv);
                    l1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                }
                else
                {

                    TextView l2=(TextView) findViewById(R.id.returntv);
                    l2.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);

                }
            }
        });
        Button search=(Button) findViewById(R.id.searachf);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sourceS=(String) spinner.getSelectedItem();
                String destinationS= (String) spinner2.getSelectedItem();
                String deptdayS= (String) spinner3.getSelectedItem();
                String retdayS=(String) spinner4.getSelectedItem();

                if(sourceS.equals("Ahemdabad"))
                    source=0;
                if(sourceS.equals("Bangalore"))
                    source=1;
                if(sourceS.equals("Bombay"))
                    source=2;
                if(sourceS.equals("Calcutta"))
                    source=3;
                if(sourceS.equals("Chennai"))
                    source=4;
                if(sourceS.equals("Delhi"))
                    source=5;
                if(sourceS.equals("Hyderabad"))
                    source=6;
                if(sourceS.equals("Indore"))
                    source=7;
                if(sourceS.equals("Ranchi"))
                    source=8;
                if(sourceS.equals("Thiruvanthapuram"))
                    source=9;
                if(destinationS.equals("Ahemdabad"))
                    dest=0;
                if(destinationS.equals("Bangalore"))
                    dest=1;
                if(destinationS.equals("Bombay"))
                    dest=2;
                if(destinationS.equals("Calcutta"))
                    dest=3;
                if(destinationS.equals("Chennai"))
                    dest=4;
                if(destinationS.equals("Delhi"))
                    dest=5;
                if(destinationS.equals("Hyderabad"))
                    dest=6;
                if(destinationS.equals("Indore"))
                    dest=7;
                if(destinationS.equals("Ranchi"))
                    dest=8;
                if(destinationS.equals("Thiruvanthapuram"))
                    dest=9;

                if(deptdayS.equals("Sunday"))
                    deptday=0;
                if(deptdayS.equals("Monday"))
                    deptday=1;
                if(deptdayS.equals("Tuesday"))
                    deptday=2;
                if(deptdayS.equals("Wednesday"))
                    deptday=3;
                if(deptdayS.equals("Thursday"))
                    deptday=4;
                if(deptdayS.equals("Friday"))
                    deptday=5;
                if(deptdayS.equals("Saturday"))
                    deptday=6;

                if(retdayS.equals("Sunday"))
                    retday=0;
                if(retdayS.equals("Monday"))
                    retday=1;
                if(retdayS.equals("Tuesday"))
                    retday=2;
                if(retdayS.equals("Wednesday"))
                    retday=3;
                if(retdayS.equals("Thursday"))
                    retday=4;
                if(retdayS.equals("Friday"))
                    retday=5;
                if(retdayS.equals("Saturday"))
                    retday=6;

        //        Toast.makeText(getApplicationContext(), source+" "+dest+" "+deptday+" "+retday, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(flightselect.this,flightlist.class));
            }
        });
    }
}
