package Week1.ArraysBasic;

import java.util.Arrays;
import java.util.Scanner;
// Minimum Scalar Product - Copied from Rounak

//
// You are given two vectors v1=(x1,x2,...,xn)
// and v2=(y1,y2,...,yn).
// The scalar product of these vectors is a single number,
// calculated as x1y1+x2y2+...+xnyn.
public class O11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int i, j,val, arr1[],arr2[],count=0;
        arr1 = new int[len];
        arr2 = new int[len];

        for(i=0;i<len;i++)
        {
            val = sc.nextInt();
            arr1[i]=val;
        }
        for(i=0;i<len;i++){
            val = sc.nextInt();
            arr2[i]=val;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int temparr[] = new int[len];
        j=len;
        for(i=0;i<len;i++)
        {
            temparr[i]=arr2[j-1];
            j--;
        }



        int scalarProduct=0;
        for(i=0;i<len;i++)
        {
            scalarProduct+=(arr1[i]*temparr[i]);
        }
        System.out.println(scalarProduct);

    }
}
/*
1 3 5
1 2 4
1 + 6 + 20
 */