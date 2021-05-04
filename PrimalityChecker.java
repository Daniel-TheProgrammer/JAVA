
//DECLERE VARIABLE NOT WARS!! copyright©2021
//By ROOT...😉
//-----------------------------------------------------
import java.util.Scanner;

public class PrimalityChecker {
    private static Scanner scan;

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
        scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        num = scan.nextInt();

        if (isPrime(num)) {
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
