package Ch18_Recursion.ClassLab;
import java.util.Scanner;
/**
 * Created by kkang on 10/6/2016.
 * Write a recursive mathematical definition for computing X^n for a
 * positive integer n and a real number x
 *
 */
public class FactorialLab1
{
    public static double myPow(double base, int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error: Power arg");
        }
        if (n == 0) {
            return 1;
        } else {
            return (base * myPow(base, n - 1));
        }
    }
        public static void main(String[]args)throws Exception {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a real number");
            double base = input.nextDouble();

            System.out.println("Enter an integer");
            int n = input.nextInt();

            System.out.println(myPow(base,n));
        }
}

