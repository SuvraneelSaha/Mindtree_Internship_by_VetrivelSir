package Week1.ArraysBasic;

import java.util.Arrays;
import java.util.Scanner;

// compatible Arrays
/*
2 arrays are said to be compatible
if they are of the same size and if the ith element
in the first array is greater than
 or equal to the ith element in the second array for all i.
Write a  program to find whether 2 arrays are compatible or not.
 */
public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            arr2[i] = in.nextInt();
        }
        System.out.println("1St Array = "+ Arrays.toString(arr1));
        System.out.println("2nd Array = "+ Arrays.toString(arr2));
        boolean compatible = true;
        for (int i = 0; i < n; i++)
        {
            if(arr1[i] < arr2[i])
            {
                compatible=false;
            }

        }

        if(compatible)
        {
            System.out.println("Compatible");
        }
        else
        {
            System.out.println("Incompatible");
        }

    }
}
