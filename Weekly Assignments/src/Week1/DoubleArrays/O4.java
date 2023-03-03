package Week1.DoubleArrays;

import java.util.Scanner;

// 2D arrays question number 10


public class O4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[n][n];

        int num = 1;
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = num;
                    num++;
                }
            } else {
                for (int i = n-1; i >= 0; i--) {
                    matrix[i][j] = num;
                    num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(matrix[row-1][col-1]);
    }
}
