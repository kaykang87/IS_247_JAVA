package textbookChapter12EX;
import java.util.Scanner;
/**
 * Created by kkang on 9/15/2016.
 */
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " is "
                + (number1 / number2));
    }
}
