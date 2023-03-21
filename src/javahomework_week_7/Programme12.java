package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program that tells us input value is number or an alphabet or symbol.
 */

public class Programme12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        char ch = input.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is an alphabet");
        } else if (ch >='0' && ch <= '9') {
            System.out.println(ch + " is a number");
        } else {
            System.out.println(ch + " is a symbol");
        }

    }
}
