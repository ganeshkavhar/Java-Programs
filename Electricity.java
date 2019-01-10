//This shows you how method overriding works in the two classes shown below

import java.lang.*;

import java.util.Scanner;

class Commercial
{
    int rate = 10;
    void calculate(double x)
    {
        double balance = x+x*10;
        System.out.println("Total Balance is:"+balance);
    }
}

class Domestic extends Commercial
{
    int rate = 5;
    void calculate(double x)
    {
        double balance = x+x*5;
        System.out.println("Total Balance is:"+balance);
    }
}

class Bill
{
    public static void main(String args[])
    {
        Commercial c = new Commercial();
        Domestic d = new Domestic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Are u a Commercial user or a Domestic user");
        System.out.print("Enter C/D:");
        char choice = sc.next().charAt(0);
        System.out.print("Enter total units:");
        double units = sc.nextDouble();
        if(choice=='C'||choice=='c')
            c.calculate(units);
        else if(choice=='D'||choice=='d')
            d.calculate(units);
    }
}
