package Single_Dimension_Array;

import java.util.Scanner;

// search an element in an array , if found print the place
public class O6 {
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
        System.out.printf("The element %d is found at %d",find,FindNum(arr,find)+1);
    }
    static int FindNum(int[] arr,int find)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == find)
            {
                return i;
            }
        }
        return 0;
    }

}
