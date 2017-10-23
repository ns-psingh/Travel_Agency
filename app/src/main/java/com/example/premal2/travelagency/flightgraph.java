package com.example.premal2.travelagency;

import java.util.LinkedList;

/**
 * Created by premal2 on 10/23/2017.
 */

public class flightgraph {

    static public Graph graph;
    static void addEdge(Graph graph,int src,int des,int dept, int rett, int day)
    {
        flightdetail f=new flightdetail();
        f.departtime=dept;
        f.returntime=rett;
        f.day=day;
        f.dest=des;
        graph.adjListArray[src].addLast(f);
    }
    flightgraph()
    {graph= new Graph(10);
       int i=6;
        while(i>=0)
        {
        addEdge(graph,1,0,930,1045,i);
        addEdge(graph,1,0,1330,1445,i);
        addEdge(graph,1,0,900,1130,i);
        addEdge(graph,1,0,1700,1830,i);
        addEdge(graph,1,2,930,1030,i);
        addEdge(graph,1,2,1030,1130,i);
        addEdge(graph,1,2,1200,1300,i);
        addEdge(graph,1,2,1500,1600,i);
        addEdge(graph,1,2,1700,1800,i);
        addEdge(graph,1,2,1900,2000,i);
        addEdge(graph,1,2,2100,2200,i);
        addEdge(graph,1,2,2300,0,i);
        addEdge(graph,1,3,1000,1230,i);
        addEdge(graph,1,3,1500,1730,i);
        addEdge(graph,1,3,2000,2230,i);
        addEdge(graph,1,4,800,830,i);
        addEdge(graph,1,4,1300,1330,i);
        addEdge(graph,1,4,1600,1630,i);
        addEdge(graph,1,4,1900,1930,i);
        addEdge(graph,1,5,900,1100,i);
        addEdge(graph,1,5,1000,1200,i);
        addEdge(graph,1,5,1100,1300,i);
        addEdge(graph,1,5,1200,1400,i);
        addEdge(graph,1,5,1400,1600,i);
        addEdge(graph,1,5,1600,1800,i);
        addEdge(graph,1,5,1800,2000,i);
        addEdge(graph,1,5,2000,2200,i);
        addEdge(graph,1,6,1130,1200,i);
        addEdge(graph,1,6,1430,1500,i);
        addEdge(graph,1,6,1730,1800,i);
        addEdge(graph,1,7,700,830,i);
        addEdge(graph,1,7,1200,1330,i);
        addEdge(graph,1,7,1800,1830,i);
        addEdge(graph,1,8,1230,1415,i);
        addEdge(graph,1,8,1530,1715,i);
        addEdge(graph,1,8,1645,1830,i);
        addEdge(graph,1,9,1500,1530,i);
        addEdge(graph,1,9,2100,2130,i);
            i--;
        }

    }
}
