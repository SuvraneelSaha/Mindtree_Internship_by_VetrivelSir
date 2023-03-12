package Week2Assessment;

import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = {5,2,5,4,3};

        System.out.println(count_greater(arr,n));


    }
    static int count_greater(int arr[], int n)
    {
        int min = Integer.MAX_VALUE;
        int counter = 0;

        // Comparing the given element
        // with minimum element till
        // occurred till now.
        for (int i = n - 1; i >= 0; i--)
        {
            if (arr[i] > min)
            {
                counter++;
            }

            // Updating the min variable
            if (arr[i] <= min)
            {
                min = arr[i];
            }
        }
        return counter;
    }
}

