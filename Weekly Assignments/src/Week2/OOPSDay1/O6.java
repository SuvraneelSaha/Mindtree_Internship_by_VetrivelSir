package Week2.OOPSDay1;

import java.util.Scanner;

// Data Encapsulation and Static Keywords - Design 2

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ItemType obj = new ItemType();
        System.out.println("Enter the item type name");
        obj.setName(in.nextLine());
        System.out.println("Enter the cost per day");
        obj.setCostPerDay(in.nextDouble());
        System.out.println("Enter the deposit");
        obj.setDeposit(in.nextDouble());

        obj.display();

    }
}
class ItemType
{
    private String name;
    private double costPerDay;
    private double deposit;

    // Setter Functions
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCostPerDay(double costPerDay)
    {
        this.costPerDay = costPerDay;
    }
    public void setDeposit(double deposit)
    {
        this.deposit = deposit;

    }
    // Getter functions
    public String getName()
    {
        return name;
    }
    public double getCostPerDay()
    {
        return costPerDay;
    }
    public double getDeposit()
    {
        return deposit;
    }

    public void display()
    {
        System.out.println("Item type details");
        System.out.println("Name : "+getName());
        System.out.printf("CostPerDay : %.2f",getCostPerDay());
        System.out.println();
        System.out.printf("Deposit : %.2f",getDeposit());

    }

}