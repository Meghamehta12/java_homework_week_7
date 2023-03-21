package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program to input any number and find out if it’s odd or even.
 */

public class Programme6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
        input.close();
    }
}
