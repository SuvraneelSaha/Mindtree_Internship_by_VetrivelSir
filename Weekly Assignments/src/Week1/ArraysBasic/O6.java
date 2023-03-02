package Week1.ArraysBasic;

import java.util.ArrayList;
import java.util.Scanner;
// Array Deletion
// Write a program to delete an element from an array.

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(n);

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++)
        {
            arr.add(in.nextInt());

        }
        System.out.println("Enter the location where you wish to delete an element");
        int pos = in.nextInt();
        arr.remove(pos-1);
        System.out.println("Array after deletion is");
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
