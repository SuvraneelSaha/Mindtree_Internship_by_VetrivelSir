package Arrays;

import java.util.Scanner;
// Reverse a String

public class O4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = in.nextLine();
        String str1 ="";
        for (int i = str.length()-1; i >=0 ; i--)
        {
            str1 = str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}
