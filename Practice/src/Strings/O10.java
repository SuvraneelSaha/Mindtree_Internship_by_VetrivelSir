package Strings;
// Enter a string and find the number of letters in each word
// this one is a wrong approach

public class O10 {
    public static void main(String[] args) {
        String str = "I Love India";
        str =str +' ';
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {

            char ch = str.charAt(i);
            if(ch!=' ')
            {
                count++;
            }
            else
            {
                count = 0 ;
            }
            System.out.print(count+" ");

        }

    }
}
