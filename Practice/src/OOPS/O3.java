package OOPS;

import java.util.Scanner;

public class O3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Bank1 bani = new Bank1();

        Bank1 ahan = new Bank1("Ahan",103,70000);

        ahan.meth();
        System.out.println("enter your name");
        String name = in.nextLine();
        Bank1 akash = new Bank1(name,104,8000);
        akash.meth();

        Bank1 sanjib = new Bank1("Sanjib",102,10000);

        bani.name = "Banibrata";
        bani.acc_num = 101;
        bani.bal = 5000 ;

        sanjib.meth();


       // bani.meth();

        int x = Hello(10) + 100 ;
     //   System.out.println(x);




    }
  static int Hello(int n)
    {
        int x = n+1;
       return x;
    }
}
class Bank1
{
    int acc_num;
    int bal;
    String name;

Bank1(String name , int acc_num,int bal)
{
    this.name = name;
    this.acc_num = acc_num;
    this.bal = bal;
}
Bank1()
{

}

    void meth()
    {
        int x = bal + 1000;

        System.out.println("Hi "+name);
        System.out.println("New Balance "+x);


    }
}
