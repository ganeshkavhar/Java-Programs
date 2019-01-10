\*This explains you how to create an User-Defined Exception. This is done because certain exceptions cant be represented 
by Built-in Exceptions.*/

import java.lang.*;

public class MyException extends Throwable
{
    private static int[] accno = {1001,1002,1003,1004};
    private static String[] name = {"Aswin","Bharath","Kartheek","Nikhil"};
    private static double[] salary = {1000,100,2000,1000};

    MyException()
    {

    }

    MyException(String str)
    {
        super(str);
    }

    public static void main(String ags[])
    {
        try
        {
            System.out.println("Accno.\tName\tSalary");
            for(int i=0;i<4;i++)
            {
                System.out.println(accno[i]+"\t"+name[i]+"\t"+salary[i]);
                if(salary[i]<1000.0)
                {
                    MyException me = new MyException("Insufficient balance");
                    throw me;
                }
                
            }
        }
        catch(MyException me)
        {
            System.out.println(me);
        }
    }
}
