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

public class flightselect extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flightselect);
        Spinner spinner = (Spinner) findViewById(R.id.from_city);
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

        Spinner spinner2 = (Spinner) findViewById(R.id.to_city);
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

        Spinner spinner3 = (Spinner) findViewById(R.id.departday);
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
        spinner4.setAdapter(myAdapter2);

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

    }
}
