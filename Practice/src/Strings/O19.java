package Strings;
// Enter a string and print the first letter of each word
public class O19 {
    public static void main(String[] args) {
        String str = "I love India";
        str = str+" ";
        String word="";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                word = word+ch;
            }
            else
            {
                System.out.print(word.charAt(0));
                word="";
            }
        }

    }
}
