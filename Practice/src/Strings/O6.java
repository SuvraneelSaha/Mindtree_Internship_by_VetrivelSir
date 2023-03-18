package Strings;

import java.util.Locale;

// enter a string and find the numbers of vowels
public class O6 {
    public static void main(String[] args) {
        String str = "Hello   India";
        str = str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.trim().charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
        }
        System.out.println("vowels "+count);

    }
}
