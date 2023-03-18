package Strings;
// enter a string and find the numbers of letters
public class O4 {
    public static void main(String[] args) {
        String str = "Hello India";
        System.out.println("the Number of letters are ");
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {

            if(str.charAt(i) !=' ')
            {
                count++;
            }
        }
        System.out.print(count);
        System.out.println("the string length using the .length() function is");
        System.out.println(str.length());

    }
}
