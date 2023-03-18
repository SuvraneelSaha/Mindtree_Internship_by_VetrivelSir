package StringsBasics;

public class O21 {
    public static void main(String[] args) {
        String str = "i love india";

        String word  ="";
        char c = str.charAt(0);
        if(c >='a'&& c <='z')
        {
            word = word +(char)(c -32);
        }
        else
        {
            word = word + c;
        }
        for (int i = 1; i < str.length(); i++)
        {
                char ch = str.charAt(i);
                if(ch!=' ')
                {
                    word = word+ch;
                }
                else
                {
                    System.out.print(word + " ");
                    word="";
                    word = word +Character.toUpperCase(str.charAt(i+1));
                    i++; // if not then we will get the same i for 2nd time
                }
        }
        System.out.print(word);
    }
}
