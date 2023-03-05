package Week2.OOPSDay1;

import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Customer Details");

        System.out.println("Enter the name");
        String customerName = in.nextLine();

        System.out.println("Enter the email");
        String customerEmail = in.nextLine();

        System.out.println("Enter the type");
        String customerType = in.nextLine();

        System.out.println("Enter the location");
        String customerLocation = in.nextLine();

        Customer1 obj = new Customer1(customerName,customerEmail,customerType,customerLocation);

        obj.displayDetails();
    }
}
class Customer1 {
    public String customerName;
    public String customerEmail;
    public String customerType;
    public String customerLocation;

    Customer1(String customerName, String customerEmail, String customerType, String customerLocation) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerLocation = customerLocation;

    }
    public void displayDetails()
    {
        System.out.println("Customer Details");
        System.out.println("Name: "+this.customerName);
        System.out.println("E-mail: "+this.customerEmail);
        System.out.println("Type: "+this.customerType);
        System.out.println("Location: "+this.customerLocation);
    }
}