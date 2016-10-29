package Ch20_List_Stack_Queues_Iterators.Stack_Practice;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by kyong on 10/29/2016.
 */
public class TowerOfHanoi_Stack {

    static Scanner input = new Scanner(System.in);

    private static ArrayList<Stack<Integer>> stacks = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("Enter number of disks: ");
        int diskNumber = input.nextInt();
        for (int i = 0; i < diskNumber; i++) {
            stacks.add(new Stack<>());
        }

        Stack center = stacks.get(1); // center stack


        for (int i = diskNumber; i > 0; i--) { // push 3 disks
            stacks.get(0).push(i);
        }


        boolean smallestMove = true;
        while (center.size() != diskNumber) {
            if (smallestMove)
                moveSmallest();
            else
                makeMove();
            smallestMove = !smallestMove;
            printStacks();
        }
    }

    public static void makeMove() {

        ArrayList<Stack<Integer>> excludeSmallest = new ArrayList<>(stacks);
        excludeSmallest.remove(getSmallest());

        Stack<Integer> stack1 = excludeSmallest.get(0);
        Stack<Integer> stack2 = excludeSmallest.get(1);

        if (stack1.empty() && stack2.isEmpty()) return;
        if (stack1.empty())
            stack1.push(stack2.pop());
        else if (stack2.isEmpty())
            stack2.push(stack1.pop());
        else if (stack1.peek() < stack2.peek())
            stack2.push(stack1.pop());
        else
            stack1.push(stack2.pop());
    }

    public static void moveSmallest() {
        Stack<Integer> smallest = getSmallest();

        int size = stacks.size();
        int index = stacks.indexOf(smallest);
        int delta = ((size & 1) == 1) ? 1 : -1;
        index += delta;

        if (index < 0)
            index = size - 1;
        if (index == size)
            index = 0;

        // Move smallest
        stacks.get(index).push(smallest.pop());
    }

    public static Stack<Integer> getSmallest() {
        Stack<Integer> smallest = null;
        for (Stack<Integer> stack : stacks) {
            if (smallest == null) smallest = stack;
            if (stack.isEmpty()) continue;
            try {
                if (smallest.isEmpty())
                    smallest = stack;
                else if (stack.peek() < smallest.peek())
                    smallest = stack;
            } catch (EmptyStackException ignore) {
            }
        }
        return smallest;
    }


    public static void printStacks() {
        System.out.println("Stacks:");
        for (Stack stack : stacks) {
            System.out.println(stack);
        }
        System.out.println("");
    }
}