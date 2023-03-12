package Week2Assessment;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Item Type");
        int n = input.nextInt();
        ItemType[] itemTypeArray = new ItemType[n];
        ItemTypeBO iB = new ItemTypeBO();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Item Type " + (i + 1) + " Name");
            String name = "";
            while (!input.hasNextInt())
                name = name + input.next();
            System.out.println("Enter the Deposit Amount ");
            double deposit = input.nextDouble();
            System.out.println("Enter the Cost per day");
            double costPerDay = input.nextDouble();
            ItemType item = new ItemType(name, deposit, costPerDay);
            iB.add(item, itemTypeArray, i);
        }
        iB.display(itemTypeArray);
        System.out.println("Enter the Name of the item to be searched");
        String search = "";
        while (input.hasNext())
            search = search + input.next();
        // Ssearch = input.nextLine();
        iB.search(search, itemTypeArray);
    }
}
 class ItemType {
    //Your code here
    private String name;
    private double deposit;
    private double costPerDay;
    ItemType(){}
    ItemType(String name, double deposit, double costPerDay){
        this.name=name;
        this.deposit=deposit;
        this.costPerDay=costPerDay;
    }
    public String getName(){
        return this.name;
    }
    public double getDeposit(){
        return this.deposit;
    }
    public double getCostPerDay(){
        return this.costPerDay;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDeposit(double deposit){
        this.deposit=deposit;
    }
    public void setCostPerDay(double costPerDay){
        this.costPerDay=costPerDay;
    }
}
 class ItemTypeBO
 {

    public void add(ItemType n1,ItemType[] itemTypeArray,Integer index){
        //Your code here
        itemTypeArray[index]=n1;
        System.out.println("New item added successfully");
    }

    public void search(String search,ItemType[] itemTypeArray){
        //Your code here
        for(int i=0;i<itemTypeArray.length;i++)
            if(itemTypeArray[i].getName().equals(search)){
                System.out.println("Searched Item Type is:");
                System.out.println("Name:"+itemTypeArray[i].getName());
                System.out.printf("Deposit Amount:%.1f\n",itemTypeArray[i].getDeposit());
                System.out.printf("Cost Per Day:%.1f\n",itemTypeArray[i].getCostPerDay());
                return;
            }
        System.out.println("Searched Item Type not found");
    }
    public void display(ItemType[] itemTypeArray)
    {
        //Your code here
        for(int i=0;i<itemTypeArray.length;i++){
            System.out.println("Item Type Number "+(i+1)+":");
            System.out.println("Name:"+itemTypeArray[i].getName());
            System.out.printf("Deposit Amount:%.1f\n",itemTypeArray[i].getDeposit());
            System.out.printf("Cost Per Day:%.1f\n",itemTypeArray[i].getCostPerDay());
        }
    }
}