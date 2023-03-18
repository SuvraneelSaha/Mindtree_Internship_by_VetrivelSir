package Single_Dimension_Array;

import java.util.Scanner;

// Enter the size and elements of an array and find the average, largest, smallest and the sum t
// together using a single for loop
public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("Sum = "+sum);
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);
        System.out.println("Average = "+(sum/n));


    }
}
