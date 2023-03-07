package Week1.ForLoopPatterns;

import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner bunny = new Scanner(System.in);
        int n = bunny.nextInt();

        int countS=0;
        for(int i=1;i<=(n-2)/2;i++){
            for(int j=1;j<=(n-countS)/2;j++){
                System.out.print("C");
            }
            for(int k=1;k<=countS;k++){
                System.out.print("S");
            }
            for(int j=1;j<=(n-countS)/2;j++){
                System.out.print("C");
            }
            countS+=2;
            System.out.println();
        }
        for(int i=1;i<=2;i++){
            for(int j=1;j<=n;j++){
                System.out.print("S");
            }
            System.out.println();
        }
        countS-=2;
        for(int i=1;i<=(n-2)/2;i++) {
            for (int j = 1; j <= (n - countS) / 2; j++) {
                System.out.print("K");
            }
            for (int k = 1; k <= countS; k++) {
                System.out.print("S");
            }
            for (int j = 1; j <= (n - countS) / 2; j++) {
                System.out.print("K");
            }
            countS -= 2;
            System.out.println();
        }
    }
}
