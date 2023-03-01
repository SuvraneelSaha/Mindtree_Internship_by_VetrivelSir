package Day2;

public class O5 {
    public static void main(String[] args) {
        int i = 1;
        do
        {
            System.out.println(2*i);
            i++;
        }
        while (i<=12);
        Test_while(12);
    }
    static void Test_while(int n)
    {
        do
        {
            System.out.println(2*n);
            n--;
        }while(n>=1);
    }
}
