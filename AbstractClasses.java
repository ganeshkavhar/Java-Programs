/*This explains you how abstract classes and methods work in Java.
By using the same method name we can perform different operations for different objects.*/


import java.lang.*;

abstract class Car
{
    abstract void brake();
    abstract void steering();
}

class Maruti extends Car
{
    void brake()
    {
        System.out.println("Applying Brakes...");
        System.out.println("Hydraulic Brakes");
    }
    void steering()
    {
        System.out.println("Steering Left...");
        System.out.println("Manual Steering");
    }

}

class Suzuki extends Car
{
    void brake()
    {
        System.out.println("Applying Brakes...");
        System.out.println("Gas Brakes");
    }
    void steering()
    {
        System.out.println("Steering Left...");
        System.out.println("Power Steering");
    }

}

class Myclass
{
    public static void main(String args[])
    {
        Maruti obj1 = new Maruti();
        Suzuki obj2 = new Suzuki();
        Car ref;
        ref = obj1;
        System.out.println("----Maruthi----");
        ref.brake();
        ref.steering();

        ref = obj2;
        System.out.println("----Suzuki----");
        ref.brake();
        ref.steering();
    }
}
