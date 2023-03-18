package Single_Dimension_Array;

import java.util.Arrays;
import java.util.Scanner;

// Enter the size and elements of an array and physically store the array in reverse order
public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        for (int i = 0,j= arr.length-1; i < arr.length/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
