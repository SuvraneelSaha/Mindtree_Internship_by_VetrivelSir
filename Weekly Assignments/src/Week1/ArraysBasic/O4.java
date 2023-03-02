package Week1.ArraysBasic;

import java.util.Arrays;
import java.util.Scanner;
// Number of Distinct Elements in an Unsorted Array
// 3 2 3 780 90
// ans - 4 distinct elements

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(arr));

        int c = 0 ;
        for (int i = 0; i < arr.length; i++) // ex - arr 3 2 3
        {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count = count + 1;
                }
            }
            if (count == 1)
            {
                c++;
            }

        }
        System.out.println(c);

    }
}
