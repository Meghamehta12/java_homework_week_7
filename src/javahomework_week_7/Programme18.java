package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program to sum values of an array
 */

public class Programme18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scan.nextInt();
        int array [] = new int[size];
        int sum = 0;
        for (int i=0; i<size; i++){
            System.out.println("Enter the Elements");
            array[i] = scan.nextInt();
            sum = sum + array[i];
        }
        scan.close();
        System.out.println("Printing the elements in an array");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Sum of the array is: " + sum);
    }
}
