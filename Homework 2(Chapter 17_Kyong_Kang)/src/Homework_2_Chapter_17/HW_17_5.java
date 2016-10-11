package Homework_2_Chapter_17;
import java.io.*;
import java.util.Date;

/**
 * Created by Kyong Kang on 10/5/2016.
 * IS 247 Homework 2
 * Chapter 17. 17.5
 *
 * (Store objects and arrays in a file)
 * Write a program that stores an array of the five int
 * values 1, 2, 3, 4, and 5, a Date object for the current time,
 * and the double value 5.5 into the file named Exercise17_05.dat.
 */
public class HW_17_5 {
    public static void main(String[] args) throws IOException {

        int[] arrayNumbers = {1, 2, 3, 4, 5};
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))) {
            out.writeObject(arrayNumbers);
            out.writeObject(new Date());
            out.writeDouble(5.5);
        }
    }
}