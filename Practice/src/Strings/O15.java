package Strings;
// enter a string and find the word having the max of vowels
public class O15 {
    public static void main(String[] args) {
        String str = "I love India";
        str=str.toLowerCase();
        str = str+" ";
        String word ="";
        int vowel=0;
        int ans = 0;
        String word_with_vowels="";
        for (int i = 0; i < str.length(); i++)
        {
                char ch = str.charAt(i);
                if(ch!=' ')
                {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    {
                        vowel++;
                    }
                    word = word + ch;
                }
                else
                {
                    if(vowel > ans)
                    {
                        ans = vowel;
                        word_with_vowels = word;
                    }
                    word="";
                    vowel = 0 ;
                }
        }
        System.out.println(word_with_vowels);

    }
}
