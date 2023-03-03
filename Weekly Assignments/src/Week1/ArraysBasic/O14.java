package Week1.ArraysBasic;

import java.util.Scanner;
// Stock Span - Copied from Rounak
public class O14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mainArr = new int[n];
        int i,j;
        for(i=0;i<n;i++){
            int val = sc.nextInt();
            mainArr[i] = val;
        }

        int stockSpan[] = new int[n];
        for(i=0;i<n;i++)
        {
            stockSpan[i]=1;
            for (j=i-1;j>=0&&mainArr[j]<=mainArr[i];j--)
            {
                stockSpan[i]++;
            }
        }

        for(i=0;i<n;i++){
            System.out.println(stockSpan[i]);
        }
    }
}
