import java.io.*;
import java.lang.*;

public class Fibonacci
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of terms:");
        int n = Integer.parseInt(br.readLine());
        long f,f1,f2;
        int i=1;
        f1=0;
        f2=1;
        f=f1+f2;
        if(n==1||n>1)
            System.out.println(f1);
        if(n==2||n>1)
            System.out.println(f2);
        i=3;
        while(i<=n)
        {
            System.out.println(f);
            f1 = f2;
            f2 = f;
            f = f1+f2;
            i++;
        }
    }
}
