package Strings;

public class O21 {
    public static void main(String[] args) {
        String str = "I love India";
        str = str+" ";
        String word  ="";
        for (int i = 0; i < str.length(); i++)
        {
                char ch = str.charAt(i);
                if(ch!=' ')
                {
                    word = word+ch;
                }
                else
                {
                    System.out.println();
                    word="";
                }
        }
    }
}
