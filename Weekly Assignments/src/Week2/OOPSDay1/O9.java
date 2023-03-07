package Week2.OOPSDay1;

import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Event obj = new Event();

        System.out.println("Enter the event name");
        obj.setEventName(in.nextLine());
        System.out.println("Enter the hall name");
        obj.setHallName(in.nextLine());
        System.out.println("Enter the start date(dd/MM/yyyy)");
        obj.setStartDate(in.nextLine());
        System.out.println("Enter the end date(dd/MM/yyyy)");
        obj.setEndDate(in.nextLine());
        System.out.println("Enter the no of people");
        obj.setNoOfPeople(in.nextInt());
        System.out.println("Inside Static Method");
        displayDetails(obj);
        System.out.println("Inside Non-Static Method");
        displayDetails(obj);
    }
    static void displayDetails(Event e)
    {
        e.display();
    }
}
class Event
{
   private String	eventName;
   private String	hallName;
   private String	startDate;
   private String	endDate;
   private int	noOfPeople;
   public void setEventName(String eventName)
   {
       this.eventName = eventName;
   }
   public void setHallName(String hallName)
   {
       this.hallName = hallName;
   }
   public void setStartDate(String startDate)
   {
       this.startDate=startDate;

   }
   public void setEndDate(String endDate)
   {
       this.endDate=endDate;

   }
   public void setNoOfPeople(int noOfPeople)
   {
       this.noOfPeople = noOfPeople;

   }

    public String getEventName()
    {
        return eventName;
    }

    public String getHallName()
    {
        return hallName;
    }

    public String getStartDate()
    {
        return startDate;

    }
    public String getEndDate()
    {
        return endDate;
    }
    public int getNoOfPeople()
    {
        return noOfPeople;

    }
    public void display()
    {
        System.out.println("Event Name: "+this.eventName);
        System.out.println("Hall Name: "+this.hallName);
        System.out.println("Start Date: "+this.startDate);
        System.out.println("End Date: "+this.endDate);
        System.out.println("No of People: "+this.noOfPeople);


    }

}