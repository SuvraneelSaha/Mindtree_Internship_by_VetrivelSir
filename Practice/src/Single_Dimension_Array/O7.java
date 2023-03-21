package Single_Dimension_Array;

import java.util.Scanner;

// find the frequency of an element
public class O7 {
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
        System.out.println("Please enter the element to be found ");
        int find = in.nextInt();
        int count = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == find)
            {
                count ++;
            }
        }
        System.out.println("The frequency count is "+count);

    }
}
