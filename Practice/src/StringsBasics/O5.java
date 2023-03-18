package StringsBasics;
// Find the number of consonants
public class O5 {
    public static void main(String[] args) {
        String str = "hello ";
        str=str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch>= 'a' && ch <= 'z')
            {


                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {

                }
                else
                {
                    count++;
                }
            }
        }
        System.out.println("Consonants ="+count);

    }
}
