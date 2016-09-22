package Homework_1_Chapter_12;
import java.util.Scanner;

/**
 * Created by kkang on 9/21/2016.
 * Homework 1 IS 247.
 * Chapter 12.3
 */

public class ArrayIndexOutOfBoundsHW {

    public static void main(String[] args) {

        // creating an array with 100 random integers
        int[] myList = new int[100];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);
        }
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the index of the array. ");

        try {
            int arrayIndex = input.nextInt();
            System.out.println("array["+ arrayIndex +"] = " + myList[arrayIndex]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("INDEX is out of bounds");
        }
    }
}
