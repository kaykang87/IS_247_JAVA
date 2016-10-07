package textbookChapter18EX.ClassLab;
import java.util.Scanner;

/**
 * Created by kyong kang on 10/6/2016.
 * Rewriting "ComputeFibonacci" class using tail recursion
 */
public class FibonacciLab2 {
    //The method for finding the Fibonacci number
    public static long fib(long index){
        if (index == 0) {
            return 0;
        } else if (index == 1) // Base case
        {
            return 1;
        }else{
        return fib(index, 0,1);
    }}

    public static long fib(long index, long a ,long b) {
        if (index == 0) {
            return a;
        } else // Reduction and recursive calls
        {
            return fib(index-1, b , a+b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index "
                + index + " is " + fib(index));
    }

}

