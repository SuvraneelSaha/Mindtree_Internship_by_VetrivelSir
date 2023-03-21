package Single_Dimension_Array;

import java.util.Scanner;

// Find the middle most element
public class O8 {
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
        MiddleMostElement(arr);


    }
    // 11 22 33 44 55 66
    // 0  1   2  3 4 5
    static void MiddleMostElement(int[] arr)
    {
        if(arr.length%2==0)
        {
            System.out.println("The Middle Most elements are "+arr[(arr.length/2)-1] +","+arr[arr.length/2]);
        }
        else
        {
            System.out.println("The Middle most element is "+arr[arr.length-1]/2);
        }
    }
}
