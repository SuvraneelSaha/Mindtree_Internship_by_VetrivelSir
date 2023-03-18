package Single_Dimension_Array;

import java.util.Arrays;
import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int find = in.nextInt();

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == find)
            {
                System.out.println("Found");
                break;
            }
        }

    }
}
