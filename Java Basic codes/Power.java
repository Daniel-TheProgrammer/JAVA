
//Program to return a number(base) raise to it's exponent
//DECLERE VARIABLE NOT WARS!! copyright©2021
//By ROOT...😉
//-----------------------------------------------------
import java.util.Scanner;

public class Power {
    private static Scanner scan;

    public static void main(String[] args) {
        double power = 1;
        int num, i, exp;

        scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        num = scan.nextInt();

        System.out.print("Enter the exponent:");
        exp = scan.nextInt();
        for (i = 1; i <= exp; i++) {
            power = power * num;

        }
        System.out.println("\nAnswer: " + power);
    }
}
