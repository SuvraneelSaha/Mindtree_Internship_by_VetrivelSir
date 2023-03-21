package Single_Dimension_Array;

import java.util.Arrays;
import java.util.Scanner;

// Write a program to copy one array elements to another array
public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Please enter your elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] =in.nextInt();

        }

        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr1[i] = arr[i];
        }

        System.out.println("New Array copied "+ Arrays.toString(arr1));

    }
}
