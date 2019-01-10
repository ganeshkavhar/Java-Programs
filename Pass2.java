import java.lang.*;

public class Pass2
{
    int id1 , id2;
    Pass2(int id1 , int id2)
    {
        this.id1 = id1;
        this.id2 = id2;
    }
    Pass2()
    {

    }
    void swap(Pass2 obj)
    {
        Pass2 temp = new Pass2();
        temp.id1 = obj.id1;
        obj.id1 = obj.id2;
        obj.id2 = temp.id1;

        System.out.println("The values of id1 and id2 are:"+obj.id1+","+obj.id2);
    }
}

class Swap
{
    public static void main(String args[])
    {
        Pass2 obj = new Pass2(10,20);
        obj.swap(obj);
        System.out.println("The values of id1 and id2 are:"+obj.id1+","+obj.id2);
    }
}
