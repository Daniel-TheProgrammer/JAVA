
//Program to return a number(base) raise to it's exponent
//DECLERE VARIABLE NOT WARS!! copyright©2021
//By ROOT...😉
//-----------------------------------------------------
import java.util.Scanner;

public class PrimalityChecker {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        if (isPrime(7)) {
            System.out.println("\nTrue");
        } else {
            System.out.println("\nFalse");
        }
        if (isPrime(18)) {
            System.out.println("\nTrue");
        } else {
            System.out.println("\nFalse");
        }
    }
}
