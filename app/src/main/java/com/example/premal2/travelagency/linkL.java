package com.example.premal2.travelagency;

/**
 * Created by premal2 on 9/24/2017.
 */

public class linkL {
    protected Node start;
    protected Node end ;
    public int size ;

    /*  Constructor  */
    public linkL()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }
    /*  Function to insert an element at end  */
    public void add(userinfo val)
    {
        Node nptr = new Node(val,null);
        size++ ;
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    /*  Function to delete an element at position  */
    public boolean credsearch(String username,String password)
    {
        System.out.print("\nSearching");
        if (size == 0)
        {
            System.out.print("Size 0 hai");
            System.out.print("Not Found\n");
            return false;
        }
        if (start.getLink() == null)
        {
            System.out.print("Size 1 hai");
            if((start.getData().getUsername().equals(username))&&(start.getData().getPassword().equals(password)))
            {
                System.out.print("Found\n");
                return true;}
            return false;
        }


        Node ptr = start;
        if((start.getData().getUsername().equals(username))&&(start.getData().getPassword().equals(password)))
        {

            System.out.print("Found");
            return true;
        }
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            if((ptr.getData().getUsername().equals(username))&&(ptr.getData().getPassword().equals(password)))
                return true;
            System.out.print(ptr.getData().getUsername() + "->");
            ptr = ptr.getLink();
        }
        if((ptr.getData().getUsername().equals(username))&&(ptr.getData().getPassword().equals(password)))
        {
            System.out.print("Found");
            return true;
        }
        System.out.print(ptr.getData().getUsername() + "\n");
        return false;
    }
    /*  Function to display elements  */
    public boolean usernamesearch(userinfo u)
    {
        System.out.print("\nSearching");
        if (size == 0)
        {
            System.out.print("Size 0 hai");
            System.out.print("Not Found\n");
            return false;
        }
        if (start.getLink() == null)
        {
            System.out.print("Size 1 hai");
            if(start.getData().getUsername().equals(u.getUsername()))
            {
                System.out.print("Found\n");
            return true;}
            return false;
        }


        Node ptr = start;
        if(start.getData().getUsername().equals(u.getUsername()))
        {

            System.out.print("Found");
            return true;
        }
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            if(ptr.getData().getUsername().equals(u.getUsername()))
                return true;
            System.out.print(ptr.getData().getUsername() + "->");
            ptr = ptr.getLink();
        }
        if(ptr.getData().getUsername().equals(u.getUsername()))
        {
            System.out.print("Found");
            return true;
        }
        System.out.print(ptr.getData().getUsername() + "\n");
        return false;
           }
}
