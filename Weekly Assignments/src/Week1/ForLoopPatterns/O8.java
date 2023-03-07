package Week1.ForLoopPatterns;

import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {
        Scanner bunny = new Scanner(System.in);

        int n = bunny.nextInt();

        for(int i =1 ;i<=n;i++)
        {
            for(int j=1 ; j<=n/2;j++)
            {
                System.out.print("("+" ");
            }
            for(int j=1 ; j<=n/2;j++)
            {
                System.out.print("#"+" ");
            }
            for(int j=1 ; j<=n/2;j++)
            {
                System.out.print(")"+" ");
            }
            System.out.println();
        }
    }
}
