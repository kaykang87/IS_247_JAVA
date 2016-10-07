package textbookChapter18EX;

/**
 * Created by kkang on 10/6/2016.
 */
import java.util.Scanner;

public class ComputeFactorial {

    //Return the factorial for the specified number
    public static long factorial(int n) {
        if (n == 0) // Base case
        {
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static long factorial2(int n) {
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();

        // Display factorial
        System.out.println("Factorial of " + n + " is " + factorial2(n));
    }
}
