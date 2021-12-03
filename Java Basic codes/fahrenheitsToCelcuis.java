//Done by Neba Emmanuel
//Look me up on https://github.com/Neba-Emmanuel/
import java.util.Scanner;

public class fahrenhritToCelcius {
    public static void main() {
        float c,f;

        Scanner i = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        f = i.nextFloat();
        c = (float)((f - 32) / 1.8);

        System.out.println("Temperature in Centigrate = "+c);
    }
}