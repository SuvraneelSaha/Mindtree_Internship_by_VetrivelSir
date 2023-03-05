package Week2.OOPSDay1;



import java.util.Scanner;

public class O2 {
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

        Customer obj = new Customer(customerName,customerEmail,customerType,customerLocation);


        System.out.println("Customer Details");
        System.out.println("Name: "+obj.getCustomerName());
        System.out.println("E-mail: "+obj.getCustomerEmail());
        System.out.println("Type: "+obj.getCustomerType());
        System.out.println("Location: "+obj.getCustomerLocation());


    }
}
class Customer
{
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;

    Customer(String customerName, String customerEmail, String customerType, String customerLocation) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerLocation = customerLocation;

    }

    public String getCustomerEmail() {
        //getter method;
        // for fetching the vlaue outside the class
        return customerEmail;

    }

    public String getCustomerName() {
        //getter method;
        // for fetching the vlaue outside the class
        return customerName;

    }

    public String getCustomerType() {
        //getter method;
        // for fetching the vlaue outside the class
        return customerType;

    }

    public String getCustomerLocation() {
        //getter method;
        // for fetching the vlaue outside the class
        return customerLocation;

    }
}




