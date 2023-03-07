package Week2.OOPSDay1;
// Data Encapsulation and Static Keywords - Design 1
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player obj = new Player();

        System.out.println("Enter Name:");
        String name = in.nextLine();
        System.out.println("Enter Age:");
        Integer age = in.nextInt();
        System.out.println("Enter Country:");
        String country = in.nextLine();
        country = in.nextLine();

        obj.setName(name);
        obj.setAge(age);
        obj.setCountry(country);
        System.out.println("Player Details:");
        System.out.println("Name:"+obj.getName());
        System.out.println("Age:"+obj.getAge());
        System.out.println("Country:"+obj.getCountry());

    }
}
class Player
{
    private String name;
   private Integer age;
   private String country;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getName()
    {
        return this.name;
    }
    public Integer getAge()
    {
        return this.age;
    }
    public String getCountry(){
        return this.country;
    }

}
