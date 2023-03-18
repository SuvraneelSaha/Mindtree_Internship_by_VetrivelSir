package Strings;
// enter a string and find the characters in the odd positions
public class O2 {
    public static void main(String[] args) {
        String str = "Hello India";
        for (int i = 0; i < str.length(); i++)
        {
            if(i%3==0)
            {
                System.out.println(str.charAt(i));

            }
        }

    }
}
