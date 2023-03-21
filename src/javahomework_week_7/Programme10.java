package javahomework_week_7;

import java.util.Scanner;

/**
 * Java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println(a);
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println(b);
        System.out.println("Enter a symbol (+, -, /, *) to find addition, Subtraction, multiplication and division according");
        char ch = input.next().charAt(0);

        if (ch == '+'){
            System.out.println(a+b);
        } else if (ch == '-') {
            System.out.println(a-b);
        } else if (ch == '/') {
            System.out.println(a/b);
        } else if (ch == '*') {
            System.out.println(a*b);
        } else {
            System.out.println("Invalid symbol");
        }
        input.close();
    }
}
