package Single_Dimension_Array;

import java.util.Arrays;
import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the 1st array");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Please enter your elements of the 1st array ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] =in.nextInt();
        }
        System.out.println("enter the size of the 2nd array");
        int m = in.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Please enter your elements of the 2nd array ");
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] =in.nextInt();
        }
        int[] arr3 = new int[n+m];
        for (int i = 0; i < arr.length; i++)
        {
            arr3[i] = arr[i];
        }
        for (int i = 0,j=arr.length; i < arr1.length; i++,j++)
        {
            arr3[j] = arr1[i];
        }
        System.out.println("New Concatenated Array = "+ Arrays.toString(arr3));


    }
}
