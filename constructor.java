//Displays the working of default and parametrized constructors.

import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class constructor
{
    private String name;
    private int age;

    constructor()
    {
        name = "Default";
        age = 0;
    }

    constructor(String s , int i)
    {
        name = s;
        age = i;
    }

    void details()
    {
        System.out.println("My name is:"+name);
        System.out.println("I am "+age+" Years old");
    }
}

class Details
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the user:");
        String st = br.readLine();
        System.out.println("Enter your age:");
        String a = br.readLine();
        int age = Integer.parseInt(a);
        constructor c = new constructor(st,age);
        c.details();
        System.out.println();
        constructor c1 = new constructor();
        c1.details();
    }
}
