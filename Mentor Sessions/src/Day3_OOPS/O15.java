package Day3_OOPS;

public class O15 {
    public static void main(String[] args) {
        Customer obj = new Customer();
        Customer obj1 = new Customer();
        Customer obj2 = new Customer();
        obj.setCustomerName("Nigga");
        System.out.println(obj.getCustomerName());
        obj.setCustomerEmail("niggachan");
        System.out.println(obj.getCustomerEmail());

        Customer[] arr = new Customer[5];

        arr[0] = obj;
        arr[1] = obj2;
        arr[2] = obj1;
        // this above is array of objects



    }
}

class Customer
{
    private String customerName;
    private String customerEmail;

    public String getCustomerName()
    {
        //getter method;
        // for fetching the vlaue outside the class
        return customerName;

    }
    public String getCustomerEmail()
    {
        //getter method;
        // for fetching the vlaue outside the class
        return customerEmail;

    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;

    }

    public void setCustomerName(String customerName)
    {
        // setter Method
        // for assigning the value from outside the class
        // whenever the variables are specially private
        //
        this.customerName = customerName;
    }
}

