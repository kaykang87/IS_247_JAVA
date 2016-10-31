import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kkang on 10/30/2016.
 */


public class wordOddOrEven {
    public static void main(String[] args){
        String oddAlphabet = "aeiouAEIOU";
        String evenAlphabet = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int odd = 0;
        int even = 1;




        List<Character> oddList = new ArrayList<>();
        // changes oddAlphabet to Character Array and adds it to oddList List
        for (char c : oddAlphabet.toCharArray()){
            oddList.add(c);
        }


        List<Character> evenList = new ArrayList<>();
        // changes evenAlphabet to Character Array and adds it to evenList List
        for (char c : evenAlphabet.toCharArray()){
            evenList.add(c);
        }
        // Prints out the character arrays of even and odd alphabets
        System.out.println("Odd alphabets are: \n" + oddList);
        System.out.println("Even alphabets are: \n" + evenList);

        Scanner input = new Scanner(System.in);

        System.out.println("This program will figure out if the word is Even or ODD");
        System.out.println("Please enter a single word. Only in alphabets");
        // Stores user input
        String oddOrEven = input.next();

        List<Character> inputWord = new ArrayList<>();
        // changes the user input(oddOrEven) to Character Array and adds it to inputWord List
        for (char c : oddOrEven.toCharArray()){
            inputWord.add(c);
        }

    }
}
