package Week2.OOPSDay1;

import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StaticIllustration obj1 = new StaticIllustration();
        System.out.println("Enter Object 1 details");
        System.out.println("Enter i1");
        int i1 = in.nextInt();
        obj1.setI1(i1);
        System.out.println("Enter i2");
        int i2 = in.nextInt();
        obj1.setI2(i2);
        System.out.print("Object 1 Details :");
        obj1.displayDetails();
        StaticIllustration obj2 = new StaticIllustration();
        System.out.println();
        System.out.println("Enter Object 2 details");
        System.out.println("Enter i1");
        int i11 = in.nextInt();
        obj2.setI1(i11);
        System.out.println("Enter i2");
        int i22 = in.nextInt();
        obj2.setI2(i22);

        System.out.print("Object 2 Details :");
        obj2.displayDetails();
        System.out.println();
        System.out.print("Object 1 Details :");
        obj1.displayDetails();

    }
}
class StaticIllustration
{
    private int i1;
    private static int i2;

    public void setI1(int i1)
    {
        this.i1 = i1;
    }
    public void setI2(int i2)
    {
        this.i2 = i2;
    }
    public int getI1()
    {
        return i1;

    }
    public int getI2()
    {
        return i2;
    }

    public void displayDetails()
    {
        System.out.printf(" i1 = %d,i2 = %d",getI1(),getI2());


    }
}