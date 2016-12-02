import java.util.Scanner;

/**
 * Created by kkang on 12/1/2016.
 */


public class Lab4_2 {

//Problem: Given a string, compute recursively (no loops) the number of lowercase letters in the string.
//for example:  countLower("string") → 6
//              countLower("password") → 8
//              countLower("Hi") → 1
    public static int countNumberOfLower(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int lower = Character.isLowerCase(str.charAt(0)) ? 1 : 0;
        return countNumberOfLower(str.substring(1)) + lower;
    }

    public static void main(String[] args) {
        System.out.println("Enter a text: it will tell you how many lower cases you have in the text: ");
        Scanner input = new Scanner(System.in);
        String numberOfLower = input.next();
        System.out.println(countNumberOfLower(numberOfLower));
    }
}
