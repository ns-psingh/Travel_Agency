package com.example.premal2.travelagency;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by premal2 on 9/25/2017.
 */

public class airlinefrag extends Fragment {
    private static final String TAG="AIR";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.airlinefrag,container,false);


        return view;
    }
}
