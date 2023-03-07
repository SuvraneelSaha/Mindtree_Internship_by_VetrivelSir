package Week2.OOPSDay1;

import java.util.Scanner;
// Data Encapsulation and Static Keywords - Design 3


public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of objects:");
        int obj = in.nextInt();
        System.out.println("Enter the Total no of tickets:");
        int totalnooftickets = in.nextInt();
        System.out.println("Enter the ticketid:");
        int ticketid = in.nextInt();
        System.out.println("Enter the price:");
        int price = in.nextInt();
        System.out.println("Enter the no of tickets:");
        int tickets = in.nextInt();


        Ticket obj1 = new Ticket();
        obj1.setTotalnooftickets(totalnooftickets);
        obj1.setPrice(price);
        obj1.setTicketid(ticketid);

        System.out.println("Total no of tickets: "+obj1.getTotalnooftickets());

        if(tickets>obj1.getTotalnooftickets())
        {
            System.out.println("Sorry tickets not available.");
        }
        else
        {
            System.out.println("Total amount:"+obj1.Amount(tickets));
            System.out.println("Total no of ticket after booking:"+obj1.TicketsLeft(tickets));

        }



        Ticket obj2 = new Ticket();

        System.out.println("Enter the ticketid:");
        obj2.setTicketid(in.nextInt());
        System.out.println("Enter the price:");
        obj2.setPrice(in.nextInt());
        System.out.println("Enter the no of tickets:");
         int tickets1 = in.nextInt();
        System.out.println("Total no of tickets: "+obj2.getTotalnooftickets());
        System.out.println("Total amount:"+obj2.Amount(tickets1));
        System.out.println("Total no of ticket after booking:"+obj2.TicketsLeft(tickets1));




    }
}
class Ticket
{

    
   private int ticketid;
    private int price;
    private static int totalnooftickets;

    public void setTicketid(int ticketid)
    {
        this.ticketid = ticketid;

    }
    public void setPrice(int price)
    {
        this.price = price;

    }
    public void setTotalnooftickets(int totalnooftickets)
    {
        this.totalnooftickets = totalnooftickets;
    }

    public int getTicketid()
    {
        return ticketid;
    }
    public int getPrice()
    {
        return price;
    }
    public int getTotalnooftickets()
    {
        return totalnooftickets;
    }
    public int Amount(int num)
    {
        return num*price;

    }

    public int TicketsLeft(int nooftickets)
    {
        totalnooftickets =totalnooftickets - nooftickets;

        return totalnooftickets;
    }


}
