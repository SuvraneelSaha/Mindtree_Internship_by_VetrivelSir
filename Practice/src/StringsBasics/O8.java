package StringsBasics;
// Enter a string and print it reversely
public class O8 {
    public static void main(String[] args) {
        String str = "I love India";
        for (int i = str.length()-1; i >=0 ; i--)
        {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
