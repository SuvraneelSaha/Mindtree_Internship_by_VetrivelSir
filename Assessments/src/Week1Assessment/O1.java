package Week1Assessment;

import java.util.Scanner;

public class O1 {
    /*
    Write a program to obtain a matrix and find the sum of each row and each column

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the matrix ");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = in.nextInt();

            }
        }

        System.out.println("Printing the Array ");
        for(int[] x : arr)
        {
            for (int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++)
        {
            int sum = 0 ;
            for (int j = 0; j < n; j++)
            {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of the row "+i+" = "+sum);
        }

        for (int i = 0; i < m; i++)
        {
            int sum = 0 ;
            for (int j = 0; j < n; j++)
            {
                sum = sum + arr[j][i];
            }
            System.out.println("Sum of the col "+i+" = "+sum);
        }

    }
}
