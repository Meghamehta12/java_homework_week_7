package javahomework_week_7;

/**
 * Java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Programme11 {
    public static void main(String[] args) {
        int k;
        System.out.println("Numbers divisible by 3");
        for (k = 1; k < 100; k++) {
            if (k%3 == 0)
                System.out.println(k + ", ");
        }
        System.out.println("Numbers divisable by 5");
        for (k=1; k<100; k++){
            if (k%5 == 0)
                System.out.println(k + ", ");
        }
    }
}
