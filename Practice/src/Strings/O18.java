package Strings;
// change the case in string
public class O18 {
    public static void main(String[] args) {
        String str = "I love India";
        str=str+" ";
        String str1="";
        String word="";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                if((ch>='a' && ch<='z' )||(ch>='A' && ch<='Z'))
                {
                    if(Character.isUpperCase(ch))
                    {
                        ch=Character.toLowerCase(ch);
                    }
                    else
                    {
                        ch = Character.toUpperCase(ch);
                    }
                }
                word=word+ch;
            }
            else
            {
                str1 = str1+word;
                str1=str1+" ";
                word="";
            }
        }
        System.out.println(str1);
    }
}
