 /*It helps to understand the difference between a static block and an instance method. 
 The JVM gives higher priority to static blocks and static methods during execution and then to instance methods.*/

import java.lang.*;

public class Static
{
    static
    {
        System.out.println("Hello World, this is a static method");
    }

    void hello()
    {
        System.out.println("Hello World, this is an instance method");
    }
}

class Hello
{
    public static void main(String args[])
    {
        Static s = new Static();
        s.hello();
    }
}
