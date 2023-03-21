package javahomework_week_7;

import java.util.Arrays;

/**
 * Java program to sort a numeric array and a string array.
 */

public class Programme17 {
    public static void main(String[] args) {
        int array1 [] = {40,34,50,22,35,3,15};
        String array2 [] = {"Puja","Ami","Radha","Sneha","Yashvi","Dhara","Beena"};

        System.out.println("Original Value: "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Value: "+ Arrays.toString(array1));
        System.out.println("Original Value: "+ Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted Value" + Arrays.toString(array2));
    }
}
