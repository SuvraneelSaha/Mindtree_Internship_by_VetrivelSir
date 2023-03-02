package Week1.ArraysBasic;

import java.util.Scanner;

public class O7 {
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

        System.out.println("Enter the location where you wish to delete an element");
        int pos = in.nextInt();
        if(pos<=arr.length)
        {
            for (int i = pos-1; i <arr.length-1 ; i++)
            {
                arr[i] = arr[i+1];
                // 11 22 33 44 55
                // 22 33 44 55

            }
            System.out.println("Array after deletion is");
            for (int i = 0; i < arr.length-1; i++)
            {
                System.out.println(arr[i]);

            }

        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}
