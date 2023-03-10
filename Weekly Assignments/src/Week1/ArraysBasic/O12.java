package Week1.ArraysBasic;
// Range Minimum Query - copied from
// https://github.com/akshatjain1199/L-T-Edutech-Activities


import java.util.Scanner;

public class O12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scn.nextInt();
        }
        int queries = scn.nextInt();
        for (int i = 0; i <= queries - 1; i++) {
            int left = scn.nextInt() - 1;
            int right = scn.nextInt() - 1;
            int minval = arr[left];
            for (int j = left + 1; j <= right; j++) {
                if (arr[j] < minval) {
                    minval = arr[j];
                }
            }
            System.out.println(minval);
        }
    }
}
