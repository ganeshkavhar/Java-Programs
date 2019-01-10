/* It counts the number of strings in the entered sentence and dislays the individual strings.*/

import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringCounter {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int n = st.countTokens();
        System.out.println("Number of Strings:"+n);
        for(int i=0;i<n;i++)
        {
            System.out.println(st.nextToken());
        }
    }
}
