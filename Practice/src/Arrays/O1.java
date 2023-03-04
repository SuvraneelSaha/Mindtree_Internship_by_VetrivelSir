package Arrays;

import java.util.Scanner;

// Create an array which is reverse of an original array
// ex - original array - 11 22 33 44 55
// reverse array - 55 44 33 22 11

public class O1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0;i<arr.length ;i++ )
        {
            arr[i] = in.nextInt();
        }

        int[] arr1 = new int[arr.length];

        for(int i=arr.length-1,j=0;i>=0;i--,j++)
        {
            arr1[j] = arr[i];
        }

        System.out.println("New Array ");

//        for (int i = 0; i < arr1.length; i++)
//        {
//            System.out.println(arr1[i] );
//
//        }
        //

        for(int x : arr1)
        {
            System.out.println(x);

        }

    }
}
