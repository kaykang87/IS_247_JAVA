import java.io.*;
import java.util.PriorityQueue;

/**(Display words in ascending alphabetical order)
 * Write a program that reads words from a text file and displays all the words (duplicates allowed)
 * in ascending alphabetical order. The words must start with a letter.
 * The text file is passed as a command-line argument.
 * Created by kkang on 10/27/2016.
 */

public class HW20_1{
    public static void main(String[] args) {
        File file = new File("test.txt");

        PriorityQueue<String> pQueue = new PriorityQueue<>(1000, String.CASE_INSENSITIVE_ORDER);

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = startLetter(line);
                for (String word: words) {
                    pQueue.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
        while (pQueue.size() > 0) {
            System.out.println(pQueue.poll());
        }
    }


    public static String[] startLetter(String line){
        line = line.replaceAll("[0-9]\\p{L}+", "");     // Removes any word starting with a number
        line = line.replaceAll("\\s+", " ");            // trims extra whitespace "    " into " "
        return line.split(" ");
    }
}

