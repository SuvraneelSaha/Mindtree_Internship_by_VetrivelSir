package Arrays;

import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println (" enter the size of the array :");
        int n = sc.nextInt ();
        int arr[] = new int[n];
        System.out.println ("enter the numbers :");
       // int n1 = sc.nextInt (); // dorkar nei
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--)
        {
            System.out.println(arr[i]);

        }


    }
}
