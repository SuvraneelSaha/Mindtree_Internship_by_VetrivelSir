package Strings;

import java.util.Locale;

// Enter a string and print the number of vowels in each word
// print the word containing only vowels also separately
public class O12 {
    public static void main(String[] args) {
        String str = "I love India";
        str = str+" ";
        String word="";
        int vowel_count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    word = word + ch;
                    vowel_count++;
                }
            }
            else
            {
                System.out.print("word with vowels = "+word);
                System.out.println("Vowel count = "+vowel_count);
                vowel_count=0;
                word="";
            }
        }
    }
}
