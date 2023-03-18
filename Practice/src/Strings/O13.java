package Strings;
// enter a string and find the smallest word in it
public class O13 {
    public static void main(String[] args) {
        String str = "I love India";
        str = str + " ";
        String smallest_word = str;
        String word ="";
        for (int i = 0; i < str.length(); i++)
        {
                char ch = str.charAt(i);
                if(ch != ' ')
                {
                    word = word + ch;
                }
                else
                {
                    if(word.length()<smallest_word.length())
                    {
                        smallest_word = word;
                    }
                    word="";

                }
        }
        System.out.println("Smallest word = "+smallest_word);


    }
}
