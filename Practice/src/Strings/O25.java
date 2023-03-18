package Strings;
// palindrome string
public class O25 {
    public static void main(String[] args)
    {
        String str ="madam";
        String ans ="";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            ans = ch + ans;
        }
        if(str.equals(ans))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("No");

        }
    }
}
