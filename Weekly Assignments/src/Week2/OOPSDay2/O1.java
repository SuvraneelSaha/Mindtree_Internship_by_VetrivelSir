package Week2.OOPSDay2;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Item Type");
        int n = in.nextInt();
        ItemType[] arr = new ItemType[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = new ItemType();

            System.out.println("Enter the Item Type "+(i+1)+" Name");
            String name = in.nextLine();
            name = in.nextLine();
            System.out.println("Enter the Deposit Amount");
            double deposit = in.nextDouble();
            System.out.println("Enter the Cost per day");
            double costPerDay = in.nextDouble();

            ItemType item = new ItemType(name,deposit,costPerDay);
            ItemTypeBO.add(item,arr,i);
        }
        ItemTypeBO.display(arr);
        System.out.println("Enter the Name of the item to be searched");
        String search = in.next();
        ItemTypeBO.search(search,arr);




    }
}
class ItemType
{
    private String name;
    private double deposit;
    private double costPerDay ;

    public ItemType()
    {

    }

    public ItemType(String name, double deposit, double costPerDay)
    {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay=costPerDay;

    }


    public void setName(String name)
    {
        this.name = name;

    }
    public void setDeposit(double deposit)
    {
        this.deposit = deposit;

    }
    public void setCostPerDay(double costPerDay)
    {
        this.costPerDay = costPerDay;
    }
    public String getName()
    {
        return this.name;
    }
    public double getDeposit()
    {
        return this.deposit;
    }
    public double getCostPerDay()
    {
        return this.costPerDay;

    }

}
class ItemTypeBO
{
    public static void add(ItemType n1, ItemType[] itemTypeArray, Integer index)
    {
        //Your code here
        itemTypeArray[index]=n1;
        System.out.println("New item added successfully");
    }
    public static void search(String search, ItemType[] itemTypeArray)
    {
        int check = 0 ;
        for (int i = 0; i < itemTypeArray.length; i++)
        {
            if(search.equalsIgnoreCase(itemTypeArray[i].getName()))
            {
                System.out.println("Searched Item Type is:");
                System.out.println("Name:"+itemTypeArray[i].getName());
                System.out.printf("Deposit Amount:%.1f",itemTypeArray[i].getDeposit());
                System.out.println();
                System.out.printf("Cost Per Day:%.1f",itemTypeArray[i].getCostPerDay());
                check=1;
            }

        }
        if(check==0)
        {
            System.out.println("Searched Item Type not found");
        }
    }
    public static void display(ItemType[] itemTypeArray)
    {
        for (int i = 0,j=1; i < itemTypeArray.length ; i++,j++)
        {
            System.out.printf("Item Type Number %d:",j);
            System.out.println();
            System.out.println("Name:"+itemTypeArray[i].getName());

            System.out.printf("Deposit Amount:%.1f",itemTypeArray[i].getDeposit());
            System.out.println();
            System.out.printf("Cost Per Day:%.1f",itemTypeArray[i].getCostPerDay());
            System.out.println();
        }

    }
}
