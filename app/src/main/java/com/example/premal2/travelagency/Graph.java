package com.example.premal2.travelagency;

import java.util.LinkedList;

/**
 * Created by premal2 on 10/23/2017.
 */

public class Graph {
    int v;
    LinkedList<flightdetail> adjListArray[];

    Graph(int v)
    {
        this.v=v;
        adjListArray= new LinkedList[v];
        for(int i=0;i<v;i++)
            adjListArray[i]=new LinkedList<>();
    }
}
