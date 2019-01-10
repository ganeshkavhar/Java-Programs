import java.lang.*;
import java.io.*;

class Search
{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of strings:");
        int n = Integer.parseInt(br.readLine());
        String str[] = new String[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter string:");
            str[i] = br.readLine();
        }

        System.out.println("Enter the String to be searched:");
        String search = br.readLine();

        boolean found = false;

        for(int i=0;i<n;i++)
        {
            if(search.equalsIgnoreCase(str[i]))
            {
                System.out.printf("Found at %d%n",(i+1));
                found = true;
            }
        }
    if(!found)
        System.out.println("The string is not found at any position...");
    }
}