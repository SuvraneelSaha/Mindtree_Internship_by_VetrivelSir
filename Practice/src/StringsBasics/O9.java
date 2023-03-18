package StringsBasics;
// enter a string and print the words reversely
// ex - i/p - "I love India"
// o/p - India Love I

public class O9 {
    public static void main(String[] args) {
        String str = "I love India";
        str = " "+str;
        String word ="";
        int count_words = 0;
        for (int i = str.length()-1; i >=0 ; i--)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                word = ch+word; // a  ia dia
            }
            else
            {
                System.out.print(word+" ");
                count_words++;
                word="";
            }
        }
        System.out.println("Number of words = "+count_words);


    }
}
