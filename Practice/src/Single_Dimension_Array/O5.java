package Single_Dimension_Array;

import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int k = 1 ;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = k;
                k++;
            }
        }

        int sum = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(j>=i)
                {
                    sum = sum +arr[i][j];

                }
            }
        }
        System.out.println(sum);

    }
}
