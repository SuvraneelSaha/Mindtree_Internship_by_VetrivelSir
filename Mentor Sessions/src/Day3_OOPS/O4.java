package Day3_OOPS;

public class O4 {
    public static void main(String[] args) {
        Student john = new Student();
        john.x = 100 ;
        Student obj = new Student();
        obj.x = 200 ;
        // for each and every object ,
        // new memory is getting created in memory
        // for each object
        obj.meth();
        // this method will do the printing
        // nothing will be returned
        john.meth();

        Address obj1 = new Address();
        obj1.displayAddress();

        System.out.println(new Address().hashCode());
        // object is created and it is also calling the
        // hash code method
        // this object creation method is not mandatory
        // this object creation is known as Anonymous Object
        // nameless object
        // it can be used at the time of object creation only
        // an object which has no reference is known as Anonymous Object




// we can have any number of objects

    }
  public static class Student
    {
       int x;
        public void meth()
        {
            System.out.println("hi "+x);
        }
    }
    // problem - cannot referenced from a static context
    public static class Address
    {
        public void displayAddress()
        {
            System.out.println("Hi");

        }
    }
}
