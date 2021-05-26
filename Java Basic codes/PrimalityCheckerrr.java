
package JAVA;

//DECLERE VARIABLE NOT WARS!! copyright©2021
//By ROOT...😉
//-----------------------------------------------------
import java.util.Scanner;

import java.util.Scanner;
//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class PrimalityCheckerrr {
    private static Scanner scan;

    public static int isPrime(int n) {

        if (n <= 1) {
            System.out.println("Number Is Non Prime");
        }

        else if (n >= 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    System.out.println("Number Is Non Prime");
            }
        } else {
            System.out.println("Number Is Non Prime");
        }
    }

    public static void main(String[] args) {
            scan = new Scanner(System.in);

            System.out.print("Enter a number:");
            num = scan.nextInt();

            if (isPrime(num))

        }
}
