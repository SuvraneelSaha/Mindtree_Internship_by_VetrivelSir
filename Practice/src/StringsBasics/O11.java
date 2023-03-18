package StringsBasics;

public class O11 {
    public static void main(String[] args) {
        // Enter a string and find the number of letters in each word
        String str = "i love India";
        str = str+" ";
        String word ="";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                System.out.print(word.length() +" ");
                word="";
            }
        }

    }
}
