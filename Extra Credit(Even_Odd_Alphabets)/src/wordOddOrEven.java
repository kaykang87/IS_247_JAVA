/**
 * Kyong Kang
 * IS 247
 * Extra Credit. Is the word Odd or Even?
 */

import java.util.*;

public class wordOddOrEven {
    public static void main(String[] args) {
        // initialize the
        int x = 0;
        String[] evenOdd = {"Value is 0: Word is even" , "Value is 1: Word is odd"};
        Scanner input = new Scanner(System.in);

        System.out.println("This program will figure out if the word is Even or Odd");
        System.out.println("Please enter a single word. Only in alphabets");

        while (!input.hasNext("[A-Za-z]+")) {
            System.out.println("Enter only ALPHABETS");
            input.next();
        }
        String a1 = input.next();                                       // Stores the user input into String

        char[] charArray = a1.toCharArray();                            // Convert the string into charArray

        for (char c : charArray) {                                      // Creates a for loop. Store charArray into char 'c'
            if ("aeiouAEIOU".indexOf(c) >= 0) {                         // Compare user input to condition string "aeiouAEIOU"
                ++x;                                                    // increment x if matching char is found
            }
        }
        if (x % 2 == 0) {                                               // If matching vowel is even #, it returns 0
            System.out.println(evenOdd[0]);                             // Prints out String Array [0] "Even"
        } else {                                                        // If matching vowel is odd #, it returns 1
            System.out.println(evenOdd[1]);                             // Prints out String Array [1] "Odd"
        }
    }
}
