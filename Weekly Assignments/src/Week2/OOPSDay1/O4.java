package Week2.OOPSDay1;

import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the country name");
        String name = in.nextLine();
        System.out.println("Enter the country code");
        String countryCode = in.nextLine();
        System.out.println("Enter the isd code");
        String isdCode = in.nextLine();

        Country obj = new Country(name,countryCode,isdCode);
        obj.display();

    }
}
class Country
{
    String name;
    String countryCode;
    String isdCode;

    Country(String name, String countryCode, String isdCode)
    {
        this.name = name;
        this.countryCode= countryCode;
        this.isdCode = isdCode;

    }

    public void display()
    {
        System.out.println("Country Name : "+this.name);
        System.out.println("Country Code : "+this.countryCode);
        System.out.println("ISD Code : "+this.isdCode);

    }
}