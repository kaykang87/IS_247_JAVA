package Ch20_List_Stack_Queues_Iterators.Stack_Practice;

import java.util.Arrays;

/**
 * Created by kyong on 10/29/2016.
 */
public class TheStack {

    private String[] stackArray;
    private int stackSize;

    // sets stacks as empty
    private int topOfStack = -1;

    // Sets the size to the value passed from the main method and
    // assigns it to stackArray
    TheStack(int size){
        stackSize = size;
        stackArray = new String[size];

        // Assigns the value of -1 to every value in the array
        // so I control what gets printed to screen
        Arrays.fill(stackArray, "-1");
    }

    // Adds to the stack
    public void push(String input){
        if(topOfStack+1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("Sorry but the stack is full ");
        displayTheStack();
        System.out.println("PUSH" + input + " Was Added to the Stack");
    }

    // Removes from the stack
    public String pop(){
        if(topOfStack >= 0){
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");

            // Just like in memory an item isn't deleted, but instead is just not available
            stackArray[topOfStack] = "-1";  // Assigns -1 so the value won't appear
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Sorry But the Stack is Empty");
            return "-1";
        }
    }

    public String peek(){
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the Stack\n");
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");
        for(int i = 0; i < tempString.length; i++){
            push(tempString[i]);
        }
    }

    public void popAll(){
        for(int i = topOfStack; i >= 0; i--){
            pop();
        }
    }

    public void popDisplayAll(){
        String theReverse = "";
        for(int i = topOfStack; i >= 0; i--){
            theReverse += " " + stackArray[i];
        }
        System.out.println("The Reverse: " + theReverse);
        popAll();
    }
    public void displayTheStack(){
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();

        for(int n = 0; n < stackSize; n++){
            System.out.format("| %2s "+ " ", n);
        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < stackSize; n++){
            if(stackArray[n].equals("-1")) System.out.print("|    ");
            else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
    }

    public static void main (String args[]){

        // Making 10 spaces available in the stack
        // Passing it to TheStack method
        TheStack theStack = new TheStack(10);

        // Pushing 3 integers into the stack
        theStack.push("10");
        theStack.push("17");
        theStack.push("13");

        // Look at the top value on the stack
        theStack.peek();

        // Remove values from the stack (LIFO)
        theStack.pop();

        // Add many to the stack
        theStack.pushMany("12 13 14 15");

        // Remove all from the stack
        // theStack.popAll();
        // Remove all from the stack and print them
        theStack.popDisplayAll();
        theStack.displayTheStack();
    }
}
