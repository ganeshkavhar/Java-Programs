/*It converts the decimal number entered ny the user into Binary,Octal,Hexadecimal.*/

import java.lang.*;
import java.util.Scanner;

public class convertor {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number:");
        int num = scanner.nextInt();
        System.out.println("Binary Equivalent:"+Integer.toBinaryString(num));
        System.out.printf("Octal equivalent:%o",num);
        System.out.println();
        System.out.printf("Hexadecimal Equivalent:%x",num);
        System.out.println();
    }
}
