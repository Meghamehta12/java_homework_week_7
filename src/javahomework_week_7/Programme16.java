package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Programme16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();

        if(num>0){
            System.out.println(num + " is POSITIVE");
        } else if (num<0) {
            System.out.println(num + " is NEGATIVE");
        } else {
            System.out.println("Number is ZERO");
        }
    }
}
