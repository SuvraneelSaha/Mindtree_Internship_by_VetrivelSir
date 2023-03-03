package Week1.DoubleArrays;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        int n = scanner.nextInt();

        // Read the row and column number of the element to be printed
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        // Create the matrix and fill it with values

        int[][] matrix = new int[n][n];

        int index = 1 ;
        for (int i = 0; i < n; i++)
        {
            for (int k = 0; k < n; k++)
            {
                    matrix[i][k] = index;
                    index++;
            }
        }

        for(int i = 0 ; i<n ;i++)
        {
            for (int j = n-1; j >=0 ; j--)
            {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        


        // Print the matrix and the element at the given row and column

    }
}
/*
1 2 3 4 5
6 7 8 9 10
when printing -
5 4 3 2 1
10
 */