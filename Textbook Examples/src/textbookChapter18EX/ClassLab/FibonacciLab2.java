package textbookChapter18EX.ClassLab;
import java.util.Scanner;
/**
 * Created by kyong kang on 10/6/2016.
 * Rewriting "ComputeFibonacci" class using tail recursion
 */
public class FibonacciLab2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number of the index you entered is: ");
        System.out.println(fib(index));
    }

    // Auxiliary method
    public static long fib(int index){
        if (index == 0){
            return 0;
        } else if (index == 1){
            return 1;
        } else{
            return fib(index,0,1);
        }
    }

    // tail recursion method
    public static long fib(int index, long a, long b){
        if (index == 0){
            return a;
        } else{
            return fib(index-1, b, a+b);
        }
    }
}

