package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program to input any year and find out if it is leap year or not.
 */

public class Programme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
    }
        input.close();
}
}