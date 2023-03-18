package StringsBasics;

public class O24 {
    public static void main(String[] args) {
        String str = "Happy New Year";
        String str1= "happy  new year";
        if(str.equalsIgnoreCase(str1)==true)
        {
            System.out.println("yes");

        }
        else
        {
            System.out.println("no");

        }
    }
}
