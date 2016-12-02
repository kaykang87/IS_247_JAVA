/**
 * Created by kkang on 12/1/2016.
 */

public class RecursiveDemo {
//Problem: Given a string, compute recursively (no loops) the number of lowercase 'x' letter in the string.
//for example:  countNumberOfX("xxhixx") → 4
//              countNumberOfX("xhixhix") → 3
//              countNumberOfX("hi") → 0

    public static int countNumberOfx(String str) {

        //base case to exit the method
        if (str.length() == 0) {
            return 0;
        }

        if (str.charAt(str.length() - 1) == 'x') {
            return 1 + countNumberOfx(str.substring(0, str.length() - 1));
        }

        return countNumberOfx(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {

        int response = countNumberOfx("xhixhix");
        System.out.println(response);
    }
}
