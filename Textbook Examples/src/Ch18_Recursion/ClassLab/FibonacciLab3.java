package Ch18_Recursion.ClassLab;

import java.util.Scanner;

/**
 * Created by kkang on 10/6/2016.
 */
public class FibonacciLab3 {
    public static long fib1(long n)
    {
        if (n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        } else {
            return fib1(0, 1, n);
        }
    }

    private static long fib1(long a, long b, long n) {
        if (n <= 0) {
            return a;
        }
        return fib1(b, a + b, n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int n = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index "
                + n + " is " + fib1(n));
    }
}
