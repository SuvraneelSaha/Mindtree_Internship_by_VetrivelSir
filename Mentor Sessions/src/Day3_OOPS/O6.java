package Day3_OOPS;

public class O6 {
    public static void main(String[] args) {
        /*
        Constructor
        1]a constructor in java is similar to a method that is
        invoked when an object of the class is created

        2]unlike java methods a constructor has the same name as that of that of a class

        3] the constructor method invokes whenever we are creating an object for that class
         the constructor gets automatically invoked

         4] it does not any return type
         5] it cannot be abstract static final and synchronized



         */

        /*
        where there are no arguments or parameters in case of
        constructor

         */

        maths obj = new maths();
        maths obj1 = new maths(4000);// parameterized constructor
        // this above is invoking the parameterized construcotor



    }
    static class maths
    {
        int x ;
        // Default constructor
        maths()
        {
            System.out.println("Hello Human Object");
            x=3000;
            System.out.println(x);
        }
        maths(int x)
        {
            this.x = x ;
            System.out.println("hi "+x);
        }
    }
}
