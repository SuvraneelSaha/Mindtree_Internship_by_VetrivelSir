package Week1.ArraysBasic;

import java.util.Arrays;
import java.util.Scanner;

// Array Mode
// the highest number of elements will be the mode
public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n =in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++)
        {
                arr[i] = in.nextInt();

        }

       
        int maxcount = 1 ;
        int mode = arr[0];
        for (int i = 0; i <n; i++)
        {
            int count = 0 ;
            for (int j = 0; i < n; i++)
            {
                if(arr[i] == arr[j])
                {
                    count++ ;
                }
            }

            if(count>maxcount)
            {
                maxcount=count;
                mode = arr[i];
            }
        }
        if(maxcount==1)
        {
            System.out.println("The mode of the array is none");
        }
        else{
            System.out.println("The mode of the array is ");
            System.out.println(mode);
        }





    }
}
