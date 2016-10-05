package Homework_2_Chapter_17;
import java.io.*;

/**
 * Created by Kyong Kang on 10/5/2016.
 * IS 247 Homework 2
 * Chapter 17. 17.3
 *
 *
 *(Sum all the integers in a binary data file)
 * Suppose a binary data file named Exercise17_03.dat
 * has been created and its data are created using writeInt(int)
 * in DataOutputStream. The file contains an unspecified number
 * of integers. Write a program to find the sum of the integers.
 */
public class HW_17_3 {
    public static void main(String[] args)throws IOException {
        File f = new File("Exercise17_03.dat");

        try (DataOutputStream outputStream =
                     new DataOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(f, true)))) {

            //Creates an random integer
            int random = (int)(Math.random()*100);

            //Adding random integers for the count of "random" created above
            for (int i = 0; i < random; i++) {
                outputStream.writeInt((int)(Math.random() * 100));
            }
        }

        try (DataInputStream input =
                     new DataInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(f)))) {
            int sum = 0;

            // divide the bytes into 4 to show available integer count
            int count = input.available()/4;

            //print out # of integers
            System.out.println(count);

            while (count >0) {
                // Reads four bytes and returns an int value
                sum += input.readInt();
                // Reducing count until 0 to add all its sum
                count--;
            }
            System.out.println("The sum is " + sum);
        }
    }
}
