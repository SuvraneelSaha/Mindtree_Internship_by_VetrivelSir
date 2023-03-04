package OOPS;

import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Address obj = new Address();
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        String street = in.nextLine();
        obj.street = street;
        System.out.println("Enter the city");
        String city = in.nextLine();
        obj.city = city;
        System.out.println("Enter the pincode");
        int pincode = in.nextInt();
        obj.pincode = pincode;

        System.out.println("Enter the country");
        obj.country = in.nextLine();
        obj.country = in.nextLine();

        obj.displayAddress();


    }
}
class Address
{
    String street;
    String city;
    int pincode;
    String country;

    void displayAddress()
    {
        System.out.println("Street: "+this.street);
        System.out.println("City: "+this.city);
        System.out.println("Pincode: "+this.pincode);
        System.out.println("Country: "+this.country);
    }
}
