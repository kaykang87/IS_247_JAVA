import java.io.*;

/**
 * Created by kkang on 12/15/2016.
 * Question 1
 * Given a string and a sub-string key - recursively (no loops) compute the largest sub-string
 * which starts and ends with the key and return its length.
 *  Lastly, write the output of each test case to a general text file labeled
 * "results.txt". Please read Section 3 for what to submit and how.
 * "hello" "abc" "ab"
 */


public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("results.txt");
        FileOutputStream fileWriter = new FileOutputStream(f, true);
        BufferedOutputStream buffer = new BufferedOutputStream(fileWriter);
        PrintWriter printWriter = new PrintWriter(buffer);
        printWriter.write(bigQuestion("hello"));
        printWriter.write(bigQuestion("\n"));
        printWriter.write(bigQuestion("abc"));
        printWriter.write(bigQuestion("\n"));
        printWriter.write(bigQuestion("ab"));
        printWriter.close();
    }
    public static String bigQuestion(String str)
    {
        if(str.length() < 2)
            return str;
        return str.charAt(0) + "?" + bigQuestion(str.substring(1));
    }
}
