package Homework_2_Chapter_17;
import java.io.*;

/**
 * Created by Kyong Kang on 10/3/2016.
 * Homework Chapter 17.1
 *
 * (Create a text file)
 * Write a program to create a file named Exercise17_01.txt if it does
 * not exist. Append new data to it if it already exists. Write 100
 * integers created randomly into the file using text I/O.
 * Integers are separated by a space.
 */

public class HW_17_1
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("Exercise17_01.txt");
        FileOutputStream fileWriter = new FileOutputStream(f, true);
        BufferedOutputStream buffer = new BufferedOutputStream(fileWriter);
        PrintWriter printWriter = new PrintWriter(buffer);
        if (f.exists() == false) {
            f.createNewFile();
        } else {
            System.out.println("The file already exists");
        }
        for (int i = 0; i < 100; i++) {
            printWriter.write((int) (Math.random() * 100) + " ");
        }
        printWriter.close();
    }
}

// USING ANOTHER METHOD
/**
 File f = new File("Exercise17_01.txt");
 try (PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(f, true)))){
 for (int i = 0; i < 100; i++) {
 printWriter.write((int) (Math.random() * 100) + " ");
    }
 }
 */