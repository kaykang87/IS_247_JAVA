/**
 * Created by kkang on 12/1/2016.
 */

import java.util.Scanner;

public class Lab4 {

//Problem: Given a string, compute recursively (no loops) the number of lowercase 'x' letter in the string.
//for example:  countNumberOfX("xxx-xxx-xxxx") → 10
//              countNumberOfX("xkxijx") → 3
//              countNumberOfX("hi") → 0


    public static int countNumberOfx(String str) {
        int result = 0;
        if (0 >= str.length()){
            return 0;
        } else if (str.charAt(0) == 'x'){
            result =+ 1;
        }
            return result + countNumberOfx(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println("Enter a text: it will tell you how many 'x' you have in the text: ");
        Scanner input = new Scanner(System.in);
        String numberOfx = input.next();
        System.out.println(countNumberOfx(numberOfx));
    }
}
