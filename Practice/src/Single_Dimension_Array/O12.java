package Single_Dimension_Array;

import java.util.Arrays;
import java.util.Scanner;

// Separate odd and even integers in separate arrays
public class O12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n =in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }
        int[] even = new int[evencount];
        int[] odd = new int[oddcount];
        for (int i = 0, e = 0, k = 0; i < arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                even[e] = arr[i];
                e++;
            }
            else
            {
                odd[k] = arr[i];
                k++;
            }

        }
        System.out.println("Even array = "+ Arrays.toString(even));
        System.out.println("Odd Array = "+Arrays.toString(odd));
    }
}
