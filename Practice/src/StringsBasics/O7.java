package StringsBasics;
// enter a string and find the number of words in it
public class O7 {
    public static void main(String[] args) {
        String str = "Hello India is beautiful";
        str = str +" ";
        int count=0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        System.out.println("Number of words = "+count);

    }
}
