package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program to calculate the average value of array elements
 */

public class Programme19 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int s = sc.nextInt();
        int array [] = new int[s];
        int sum = 0;
        int avg =0;

        for (int k=0; k<s; k++){
            System.out.println("Enter the elements");
            array[k] = sc.nextInt();
            sum = sum + array[k];
            avg = sum/s ;
        }
        sc.close();
        System.out.println("The average value of array elements is:" + avg);


    }
}
