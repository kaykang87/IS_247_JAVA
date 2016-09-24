package Chapter_12;
import java.util.Scanner;
/**
 * Created by kkang on 9/24/2016.
 */
public class ArrayIndexOutOfBounds{
    public static void main(String[] args) {
        boolean continueInput = true;
        int myArray[] = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }

        System.out.println("Enter a index # between 0-99");
        Scanner input = new Scanner(System.in);
        do {
            try {
                int arrayIndex = input.nextInt();
                System.out.println("Your array[" + arrayIndex + "]" + " = " + myArray[arrayIndex]);
                continueInput = false;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Please enter a index between 0-99");
            }
        }while(continueInput);
    }
}
