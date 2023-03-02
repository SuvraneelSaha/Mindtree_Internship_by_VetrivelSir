package Week1.ArraysBasic;

import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the number of elements in the array");
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();

        }
        System.out.println("Array ="+ Arrays.toString(arr));
        System.out.println("Enter the location where you wish to delete an element");
        int pos = in.nextInt();



    }


}
