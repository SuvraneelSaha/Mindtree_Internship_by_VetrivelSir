package Single_Dimension_Array;

import java.util.Arrays;
import java.util.Scanner;

// enter the size and elements of an array and then shift the
// first half of the array with the 2nd Half
// EX -
/*
i/p - 10 20 30 50 60

then
o/p - 50 60 30 10 20

i/p - 10 20 30 40 50 60
then
o/p - 40 50 60 10 20 30
 */



public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Original Array "+ Arrays.toString(arr));
        // 10 20 30 40 50 60
        // Steps -
        // 60 20 30 40 50 10
        // 50 60 30 40 10 20
        // Stupid ME - Wrong approach

        //40 50 60 10 20 30
        for (int i = 0,j=(n/2); i < n/2; i++,j++)
        {
            int temp= arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }
        System.out.println("New Array = "+Arrays.toString(arr));


    }
}
