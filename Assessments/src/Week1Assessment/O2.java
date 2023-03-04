package Week1Assessment;

import java.util.Scanner;

/*
Given a String s , find the first non repeating character in it and return
its index . if it does not exist return -1 ;
 */
public class O2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int index = -1 ;
        char fnc =' ';
        for (char i : str.toCharArray())
        {
            if(str.indexOf(i)== str.lastIndexOf(i))
            {
                fnc = i;
                break;
            }
            else
            {
                index = index+1;

            }
        }
        if(index == 1)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(str.indexOf(fnc));
        }

    }
}
