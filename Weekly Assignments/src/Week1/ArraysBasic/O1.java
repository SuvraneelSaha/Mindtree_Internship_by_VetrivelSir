package Week1.ArraysBasic;

import java.util.Scanner;
// Sum of Arrays
public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0 ;
        for(int i = 0 ; i<n;i++)
        {

            sum = sum + arr[i];
        }
        System.out.println("The sum of the elements in the array is "+sum);



    }

}
