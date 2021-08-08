package recursion;

import java.util.Scanner;

public class Recursion 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int userInput = input.nextInt();
       int result = factorialRecursive(userInput);
       System.out.println("Factorial: "+ userInput + "! = " + result);
    }
    public static int factorialRecursive(int num)
    {
        if(num == 1)
            return 1;
        
        else
            return num * factorialRecursive(num-1);
    }
}
