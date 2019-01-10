import java.lang.*;

public class Polymorphism
{
    void calculate(int a , int b)
    {
        int sum = a+b;
        System.out.println("Sum is:"+sum);
    }

    void calculate(int a , int b , int c)
    {
        int sum = a+b+c;
        System.out.println("Sum is:"+sum);
    }
}

class values
{
    public static void main(String args[])
    {
        Polymorphism p = new Polymorphism();
        p.calculate(10,11);
        p.calculate(1,2,3);
    }
}
