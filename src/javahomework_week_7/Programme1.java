package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program that tells us that Input number is odd or even.
 */

public class Programme1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        String evenOdd = (num % 2 == 0) ? "Even" : "Odd" ;
        System.out.println(num + " is a "+ evenOdd + " Number");
        input.close();
    }
}