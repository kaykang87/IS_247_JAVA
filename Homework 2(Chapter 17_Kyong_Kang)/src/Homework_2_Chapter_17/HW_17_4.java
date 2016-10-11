package Homework_2_Chapter_17;
import java.io.*;

/**
 * Created by Kyong Kang on 10/5/2016.
 * IS 247 Homework 2
 * Chapter 17. 17.4
 *
 */

public class HW_17_4 {
    public static void main(String[] args) throws IOException {

        File f = new File(args[0]);
        // If file does not exist
        if (!f.exists()) {
            System.out.println(f.getAbsolutePath());
            System.out.println("File does not exist");
            System.exit(1);
        }

        try (BufferedReader in = new BufferedReader(new FileReader(f));
             DataOutputStream out =
                     new DataOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(
                                             new File(args[1])))) ) {
            String s;
            int fileSize = 0;
            while ((s = in.readLine()) != null) {
                s += "\n";
                out.writeUTF(s);
                fileSize += s.length();
            }
            System.out.println(args[0] + " = " + fileSize + " bytes");
            System.out.println(args[1] + " = " + out.size() + " bytes");
        }

    }
}
