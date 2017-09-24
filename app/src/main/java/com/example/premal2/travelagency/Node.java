package com.example.premal2.travelagency;

/**
 * Created by premal2 on 9/24/2017.
 */

public class Node {
    protected userinfo data;
    protected Node link;
    public Node()
    {
        link = null;
        data = null;
    }
    public Node(userinfo d,Node n)
    {
        data = d;
        link = n;
    }
    public void setLink(Node n)
    {
        link = n;
    }
    public void setData(userinfo d)
    {
        data = d;
    }
    public Node getLink()
    {
        return link;
    }
    public userinfo getData()
    {
        return data;
    }
}
