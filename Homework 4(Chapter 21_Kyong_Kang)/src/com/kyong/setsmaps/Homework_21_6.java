package com.kyong.setsmaps;

import java.util.Scanner;

/**
 * Created by kkang on 11/1/2016.
 * (Count the occurrences of numbers entered) Write a program that reads an
 * unspecified number of integers and finds the one that has the most occurrences.
 * The input ends when the input is 0. For example, if you entered 2340354–3 3320,
 * the number 3 occurred most often. If not one but several numbers have the most occurrences,
 * all of them should be reported. For example, since 9 and 3 appear twice in the list 93039324,
 * both occurrences should be reported.
 **/
public class Homework_21_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[0];
        int number;
        int count = 0;
        int repeatedCount = 0;

        System.out.print("Enter the integers: ");

        while ((number = input.nextInt()) != 0) {
            numbers = addArray(numbers, number);
        }

        for (int j = 0; j < numbers.length; j++) {
            if (count != numbers[j] && numbers[j] != 0) {
                count = numbers[j];
                for (int i = j; i < numbers.length; i++) {
                    if (count == numbers[i]) {
                        repeatedCount++;
                        numbers[i] = 0;
                    }
                }
                System.out.print(count + " was repeated " + repeatedCount
                        + " time");
                System.out.println();
                repeatedCount = 0;
            }
        }
    }

    public static boolean testArray(int[] number1, int[] dest) {
        if (number1.length > dest.length)
            return false;
        for (int i = 0; i < number1.length; i++) {
            dest[i] = number1[i];
        }
        return true;
    }

    public static int[] addArray(int[] number1, int data) {
        int[] dest = new int[number1.length + 1];
        testArray(number1, dest);
        dest[number1.length] = data;
        return dest;
    }
}
