package com.example.premal2.travelagency;

/**
 * Created by premal2 on 9/14/2017.
 */

public class userinfo {
    String name;
    String email;
    String username;
    String password;
    int date;
    int month;
    int year;
    userinfo()
    {
    }
    public String getUsername()
    {
        return username;
    }
    public void setter(String name,String email,String username,String password,int date,int month,int year)
    {
        this.name=name;
        this.email= email;
        this.username= username;
        this.password= password;
        this.date=date;
        this.date=month;
        this.year=year;

    }

}
