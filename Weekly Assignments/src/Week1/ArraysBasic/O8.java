package Week1.ArraysBasic;

import java.util.Arrays;
import java.util.Scanner;

// Median of an Array

public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        if(arr.length%2==0)
        {
            // n/2 is the position the index value is (n/2)-1

            float c = (float) (arr[(n/2)-1] + arr[n/2])/2;
            System.out.println("The median of the array is "+c);

        }
        else
        {
            float c = arr[n/2];
            System.out.println("The median of the array is "+c);

        }

    }
}
