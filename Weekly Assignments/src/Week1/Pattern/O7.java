package Week1.Pattern;

import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==(n/2)+1 && j==(n/2)+1)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print("~"+" ");
                }
            }
            System.out.println();

        }
    }
}
