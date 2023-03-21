package javahomework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry.
 */

public class Programme8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F in upper case");
        char a = input.next().charAt(0);
        System.out.println(a);

        if (a == 'A'){
            System.out.println("Ahmedabad");
        } else if (a == 'B') {
            System.out.println("Banglore");
        } else if (a == 'C') {
            System.out.println("Chennai");
        } else if (a == 'D') {
            System.out.println("Delhi");
        } else if (a == 'E') {
            System.out.println("Elazig");
        } else if (a == 'F') {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid entry");
        }
        input.close();

    }
}