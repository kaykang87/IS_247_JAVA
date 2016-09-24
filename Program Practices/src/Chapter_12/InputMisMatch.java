package Chapter_12;
import java.util.*;

/**
 * Created by kkang on 9/24/2016.
 */
public class InputMisMatch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do{
            try{
                System.out.println("Enter two integers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                System.out.println(num1 + " + " + num2 + " is " + (num1+num2));
                continueInput = false;
            }catch(InputMismatchException ex){
                System.out.println("Please enter an integer: Press Enter to continue. ");
                input.nextLine();
                input.nextLine();
            }
        }while (continueInput);
    }
}
