//Done by Neba Emmanuel
//Look me up on https://github.com/Neba-Emmanuel/
import java.util.Scanner;
import java.util.Random;

public class randomNumberGenerator {
    public static void main() {
        int n, max, c;

        Scanner i = new Scanner(System.in);

        System.out.println("Enter the number of random numbers you want: ");
        n = i.nextInt();
        System.out.println("Enter the max of the random number: ");
        max = i.nextInt();

        Random t = new Random();
        System.out.println("Random Numbers:");
        for(c = 1; c <= n; c++){
            System.out.println(t.nextInt(max));
        }  
    }
}