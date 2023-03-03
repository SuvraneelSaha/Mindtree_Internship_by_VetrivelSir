package Week1.DoubleArrays;

import java.util.Arrays;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter row num");
        int row_num = in.nextInt();
        System.out.println("Enter col num");
        int col_num = in.nextInt();
        
        // creation of array
        int count = 1 ;
        for (int i = 0; i < n; i++)
        {
            for (int j = n-1; j >=0 ; j--)
            {
                arr[i][j] = count;
                count++;
            }

        }
        // print the array for checking
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        // ans of the given row and col element
        System.out.println(arr[row_num-1][col_num-1]);

        
    }
}
