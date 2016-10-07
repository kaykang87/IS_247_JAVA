package textbookChapter18EX;

import java.util.Scanner;

/**
 * Created by kkang on 10/6/2016.
 */

public class ComputeFactorialTailRecursion {

    /**
     * Return the factorial for a specified number
     */
    public static long factorial(int n) {
        return factorial(n, 1); // Call auxiliary method
    }

    /**
     * Auxiliary tail-recursive method for factorial
     */
    private static long factorial(int n, int result) {
        if (n == 0) {
            return result;
        } else {
            return factorial(n - 1, n * result); // Recursive call
        }
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();

        // Display factorial
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}