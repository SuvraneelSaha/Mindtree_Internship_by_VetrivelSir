package Day3_OOPS;

public class O10 {
    static
    {
        System.out.println("hello");
        // this comes before psvm
        //
    }
    public static void main(String[] args) {
        /*
        static variable
        it is mainly useed for memory management
        it ca be used in the following ways
        1 static vatiables
        2 methods
        3 block
        4 nested class

        ex - obj1 y = 200 ;
        only one copy of the variable will be shared with all the objects

         */

        hello obj = new hello();
        obj.x = 100 ;
        // why only x is comign and not y
        obj.y = 201;

        hello obj1 = new hello();
        obj1.x = 101 ;
        obj1.y = 202;

        System.out.println("obj"+obj.y);
        System.out.println("obj1"+obj1.y);

        System.out.println("obj "+obj.x);
        System.out.println("obj1 "+obj1.x);
        // ok that means that the static vars
        // are the common variables and they have the same value
        // across all the objects
        //
        // we can call the static var via classname.y
        // y being the static var name
        System.out.println(hello.sayHi());
        // static method
        // Read and learn



    }
    static class hello
    {
        static int y = 200 ;
        int x;// instance variable

        static boolean sayHi()
        {
            System.out.println("Hi");

            return false;
        }
    }

}
