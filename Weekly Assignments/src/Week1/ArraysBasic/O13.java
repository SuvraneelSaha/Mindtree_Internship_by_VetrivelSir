package Week1.ArraysBasic;

import java.util.Scanner;
//Stock Span
/*
The stock span problem is a financial problem
 where we have a series of n daily price quotes for a stock and
 we need to calculate span of stock’s price for all n days.
The span Si of the stock’s price on a given day i is defined as
 the maximum number of consecutive days just before the given day,
  for which the price of the stock on the current day is less than
  or equal to its price on the given day.
For example, if an array of 7 days prices is given as
{100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are
 {1, 1, 1, 2, 1, 4, 6}
 */
public class O13 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] price= new int[n];
        int[] span= new int[n];

        span[0]=1;
        price[0]=scn.nextInt();
        for(int i=1;i<=n-1;i++){
            price[i]=scn.nextInt();
            int spanval=1;
            int j=i-1;
            while(j>=0 && price[i]>=price[j]){
                spanval= spanval+span[j];
                j=j-span[j];

            }
            span[i]=spanval;
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(span[i]);
        }
    }
}
