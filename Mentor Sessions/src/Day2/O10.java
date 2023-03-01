package Day2;

public class O10 {
    public static void main(String[] args) {
        /*
        Modified for loop
        or
        for each loop



         */

        int size = 10 ;
         int [] arr = new int[size];
         arr[0] = 100;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        // all int take the value of 0 by default ;


        String[] cars = {"Volvo","BMW","Ford","Mazda"};

        for(String i : cars)
        {
            System.out.println(i);

        }
    }
}
