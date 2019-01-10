import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bank
{
    private class InnerClass
    {
        int bal;
        int interest;

        void calculate(int bal,int interest)
        {
            this.bal = bal;
            this.interest = interest;
            int total = bal * interest / 100;
            bal += total;
            System.out.println("Balance is:" + bal);
        }
    }


    void check() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the password:");
        String pass = br.readLine();
        if(pass.equals("XYz"))
        {
            InnerClass i = new InnerClass();
            i.calculate(100,5);
        }
        else
            System.out.println("Incorrect Password...You are unauthorized");
    }
}

class basic
{
    public static void main(String args[]) throws IOException
    {
        Bank b = new Bank();
        b.check();
    }
}
