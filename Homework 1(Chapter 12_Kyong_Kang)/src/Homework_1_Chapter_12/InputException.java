package Homework_1_Chapter_12;

import java.util.Scanner;
import java.util.*;

/**
 * Created by kkang on 9/21/2016.
 * Homework 1 IS 247.
 * Chapter 12.2
 */
public class InputException {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter two integers: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                System.out.println(number1 + " + " + number2 + " is " + (number1 + number2));

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.print("Try again. " +
                        "Input is Incorrect. Integer is required");
                input.nextLine();
                input.nextLine();
            }
        } while (continueInput);
    }
}
