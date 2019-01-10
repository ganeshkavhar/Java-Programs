/* It is a menu driven program to check for palindrome , print palindrome numbers within a range ,
check for armstrong , print armstrong numbers within a range.*/

import java.lang.*;
import java.util.Scanner;

public class FunWithNumbers
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.printf("%n%nMENU");
            System.out.println();
            System.out.println("1.. Check Palindrome");
            System.out.println("2.. Print Palindrome");
            System.out.println("3.. Check Armstrong");
            System.out.println("4.. Print Armstrong");
            System.out.println("5.. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            if (choice == 5)
                break;

            switch (choice)
            {
                case 1:
                case 2:
                    Functions.Palindrome(choice);
                    break;
                case 3:
                case 4:
                    Functions.Armstrong(choice);
                    break;
                default:
                    System.out.println("Enter a valid choice...");
            }
        }while(true);
    }
}

class Functions
{
    public static void Palindrome(int c)
    {
        Scanner s = new Scanner(System.in);
        if(c==1)
        {
            System.out.println("Enter the number:");
            int num = s.nextInt();
            int t = num,r=0;
            while(t!=0)
            {
                r = r*10+t%10;
                t /= 10;
            }
            if(num==r)
                System.out.println("The entered number is palindrome");
            else
                System.out.println("The entered number is not a palindrome");
        }

        else
        {
            System.out.println("Enter the starting number:");
            int n1 = s.nextInt();
            System.out.println("Enter the ending number:");
            int n2 = s.nextInt();
            for(int i=n1;i<=n2;i++)
            {
                int t = i,r=0;
                while(t!=0)
                {
                    r = r*10+t%10;
                    t /= 10;
                }
                if(i==r)
                    System.out.println(i);
            }
        }
    }

    public static void Armstrong(int c)
    {
        Scanner s = new Scanner(System.in);
        if(c==3)
        {
            System.out.println("Enter the number:");
            int num = s.nextInt();
            int t = num;
            int sum=0,m;
            while(t!=0)
            {
                m=t%10;
                sum += m*m*m;
                t /= 10;
            }
            if(sum==num)
                System.out.println("The number is an Armstrong number");
            else
                System.out.println("The number is not an Armstrong number");
        }
        else
        {
            System.out.println("Enter the starting number:");
            int n1 = s.nextInt();
            System.out.println("Enter the ending number:");
            int n2 = s.nextInt();
            for(int i=n1;i<=n2;i++)
            {
                int t = i;
                int sum = 0, m;
                while (t != 0)
                {
                    m = t % 10;
                    sum += m * m * m;
                    t /= 10;
                }
                if (sum == i)
                    System.out.println(i);
            }
        }
    }
}
