package StringsBasics;
// Write a program to tert if a given string contains the specified sequence of char values
// if the i/p is happy new year
// and we need to find new
// then the ans must be yes

public class O23 {
    public static void main(String[] args) {
        String str = "Happy New Year";
        String find ="New";
        if(str.contains(find)==true)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
