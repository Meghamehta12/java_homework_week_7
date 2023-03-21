package javahomework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch statement.
 */

public class Programme9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F in upper case");
        char alp = input.next().charAt(0);
        System.out.println(alp);

        switch (alp){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case  'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Estambul");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }
        input.close();

    }
}
