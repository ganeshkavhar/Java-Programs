import java.lang.*;

public class Pass1
{
    int id;

    Pass1(int id)
    {
        this.id = id;
    }
    Pass1()
    {

    }


    void swap(Pass1 obj1 , Pass1 obj2)
    {
        Pass1 temp = new Pass1();
        temp = obj1;
        obj1 = obj2;
        obj2 = temp;

        System.out.println("The value of ids inside swap method are:"+obj1.id+","+obj2.id);

    }
}

class Demo
{
    public static void main(String args[])
    {
        Pass1 obj1 = new Pass1(10);
        Pass1 obj2 = new Pass1(20);

        Pass1 demo = new Pass1();
        demo.swap(obj1,obj2);
        System.out.println("The values of the ids are:"+obj1.id+","+obj2.id);
    }
}
