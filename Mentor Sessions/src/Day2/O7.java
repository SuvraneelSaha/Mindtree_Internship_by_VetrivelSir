package Day2;

public class O7 {
    public static void main(String[] args) {
        // if there is no curly braces
        // the immediate statment will be considered
        // as the statement inside the for loop
        Test_break(12);


    }
    static void Test_while(int n)
    {
        int k = 2 ;
        do {
            System.out.println(k);
        }
        while (--k>0);
    }
    static void Test_break(int n)
    {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            continue;
           // System.out.println("hi");
            // break will stop the iteration and come out of loop
            // continue statment will not execute anything after it
            // and will go to the next Iteration

        }
    }

    /*
    what is break statement ?
    it is an unconditional statement
    syntax - break ;

    when you want to come out of it a for loop or a while loop
    we use break statement

     */
}
