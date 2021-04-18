//Predefint factorial and Fabronci for Number(num or n) == 5
//DECLERE VARIABLE NOT WARS!! copyright©2021
//By ROOT😉
public class Factorial {
    public static int num = 5, i, fact = 1, n = 5, fad = 1, j;;

    public static void main(String[] args) {
        for (i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Fact:" + fact);
        for (j = 0; j <= n; j++) {
            fad += j - 1;

        }
        System.out.println("Fabronaci of " + n + ": " + fad);
    }

}
