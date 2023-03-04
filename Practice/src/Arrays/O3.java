package Arrays;

// Reverse of an Array without using an extra array

import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        // Reverse
        int temp = 0 ;
//        int m = 0 ;
//        if(n%2==0)
//        {
//            m = n/2;
//        }
//        else
//        {
//            m = (n-1)/2;
//        }
        for (int i = 0,j=n-1; i < n/2; i++,j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Reverse Array ");
        for(int x:arr)
        {
            System.out.println(x);

        }

    }
}
