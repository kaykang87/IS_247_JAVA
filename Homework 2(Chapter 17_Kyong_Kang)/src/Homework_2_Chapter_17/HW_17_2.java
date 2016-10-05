package Homework_2_Chapter_17;

import java.io.IOException;
import java.io.*;

/**
 * Created by Kyong Kang on 10/4/2016.
 * IS 247 Homework 17.2 Chapter 17
 * 17.2 (Create a binary data file) Write a program to create a file named Exercise17_02.dat if it does not exist.
 * Append new data to it if it already exists. Write 100 integers created randomly into the file using binary I/O.
 */
public class HW_17_2 {
    public static void main(String[] args) throws IOException{
        File f = new File("src/text files/Exercise17_02.dat");
        boolean append = f.exists();


        try (DataOutputStream outputStream =
                     new DataOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(f, append)))){
            for (int i=0;i<100;i++){
                outputStream.write((int)(Math.random() * 100));
            }
        }
    }
}
