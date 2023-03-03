package Day3_OOPS;

public class O8 {
    public static void main(String[] args) {
     //   Y obj = new Y();
        Y obj1 = new Z();
        // we are creating for the Z class
         // but the reference is of Y class
        //

    }
    static class X
    {
        public X()
        {
            System.out.println("In X");
        }
    }
    static class Y extends X
    {
        public Y()
        {
           // super();
            System.out.println("In Y");
        }
    }
   static class Z extends Y{
        public Z()
        {
            System.out.println("In Z");
        }
    }

}
