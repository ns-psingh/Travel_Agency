package com.example.premal2.travelagency;

import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class homepage extends MainActivity {

    private static final String TAG="homepage";
    private SectionPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Toolbar t= (Toolbar) findViewById(R.id.toolbar);
        t.setTitle("Welcome "+current.name+"!");
        mSectionsPageAdapter=new SectionPageAdapter(getSupportFragmentManager());
        mViewPager=(ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        // Spinner element
       // setContentView(R.layout.airlinefrag);

        Spinner spinner = (Spinner) findViewById(R.id.from_city);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(homepage.this,
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
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(homepage.this,
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



    }


    private void setupViewPager(ViewPager viewPager)
    {
        SectionPageAdapter adapter= new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new airlinefrag(),"Flights");
        adapter.addFragment(new trainfrag(),"Trains");
        adapter.addFragment(new bookingfrag(),"My Bookings");
        viewPager.setAdapter(adapter);
    }


}
