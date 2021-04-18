//Predefint factorial for Number(num) == 5
//DECLERE VARIABLE NOT WARS!! copyright©2021
//By ROOT😉
public class Factorial {
    public static int num = 5, i, fact = 1;

    public static void main(String[] args) {
        for (i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Fact:" + fact);
    }

}

// Predefint Fabronaci for Number(num) == 5
// DECLERE VARIABLE NOT WARS!! copyright©2021
// By ROOT...😉
public class Fabronaci {

    public static int num = 5, fad = 1, i;

    public static void main(String[] args) {
        for (i = 0; i <= num; i++) {
            fad += i - 1;

        }
        System.out.println("Fabronaci of " + num + ": " + fad);
    }

}
