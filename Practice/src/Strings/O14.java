package Strings;
// Enter a string and find the largest word among it
public class O14 {
    public static void main(String[] args)
    {
        String str = "I love India";
        str = str +" ";
        String word = "";
        String largest_word="";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                word = word+ch;

            }
            else
            {
                if(word.length()>largest_word.length())
                {
                    largest_word = word;
                }
                word="";
            }
        }
        System.out.println("Largest word = "+largest_word);

    }
}
