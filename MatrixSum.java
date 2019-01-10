import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

class Matrix
{
    private int[][] arr1,arr2;
    private int r,c;
    Matrix(int r,int c)
    {
        this.r = r;
        this.c = c;
        arr1 = new int[r][c];
        arr2 = new int[r][c];
    }

    void getMatrix() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the elements of Matrix A:");
        for(int i=0;i<r;i++)
        {
            String st = br.readLine();
            StringTokenizer s = new StringTokenizer(st," ");
            for(int j=0;j<c;j++)
            {
                arr1[i][j] = Integer.parseInt(s.nextToken());
            }
        }

        System.out.println("Enter the elements of Matrix B:");
        for(int i=0;i<r;i++)
        {
            String st1 = br.readLine();
            StringTokenizer s1 = new StringTokenizer(st1," ");
            for(int j=0;j<c;j++)
            {
                arr2[i][j] = Integer.parseInt(s1.nextToken());
            }
        }
    }

    int[][] sum()
    {
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr;
    }
}

public class MatrixSum
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows:");
        String R = br.readLine();
        System.out.println("Enter the number of columns:");
        String C = br.readLine();
        int r = Integer.parseInt(R);
        int c = Integer.parseInt(C);

        Matrix m = new Matrix(r,c);
        m.getMatrix();
        int[][] a = m.sum();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

    }
}
