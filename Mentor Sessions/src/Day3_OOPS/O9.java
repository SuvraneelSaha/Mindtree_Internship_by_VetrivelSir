package Day3_OOPS;

public class O9 {
    public static void main(String[] args) {
        /*
        this keyword

        this can be used to invoke current class method implicitly
        this can be used to invoke current class constructor
        this can be passed as an argument in the method call


         */

        maths obj = new maths(10);
        System.out.println(obj.x);
        // depends upon the object
        //
    }
    static class maths
    {
        int x ; // instance variable
        maths(int x)
        {
            this.x = x;
            // this keyword is for assigning an parameter's value
            // to that of an instance variable
            // to differentiate a local variable to that of a parameter
            // we use this keyword
            // and it makes sense that the value gets assigned to a current object

        }

        public void Printx()
        {
            int dummy = 0 ; // local variable
            System.out.println(x);
        }
    }
}
