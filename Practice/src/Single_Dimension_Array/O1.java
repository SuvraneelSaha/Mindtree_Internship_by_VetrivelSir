package Single_Dimension_Array;

import java.util.Scanner;

// Enter the size of an array and then find the sum ofthose n numbers
public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum "+sum);
    }
}
