package OOPS;
// package is just a folder
// name is just different

import java.util.Scanner;

/*
Module is just a baba folder

 */
public class Sanjib {
    public static void main(String[] args)
    {
        Scanner nigga = new Scanner(System.in);
        int k = nigga.nextInt();
        System.out.println(k);


        Bank bani = new Bank();
        // bani is an object of class Bank

        Bank sanjib = new Bank();
        // sanjib is an object of class Bank

        bani.acc_num = 101 ;
        bani.bal = 5000;
        bani.name = "Banibrata";
        bani.ifsc_code = 101;


        sanjib.name = "Sanjib";
        sanjib.ifsc_code= 102;
        sanjib.bal = 10000;
        sanjib.acc_num = 102;

        //System.out.println(sanjib.name);
       // System.out.println(bani.name);


    }

}
class Bank
{
    int acc_num;
    int ifsc_code;
    int bal;
    String name;
    // instance variables




}

