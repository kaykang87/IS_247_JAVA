package Ch20_List_Stack_Queues_Iterators.ArrayList_Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyong on 10/26/2016.
 */
public class App_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(500);        // Empty () gives default size of 10

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // Retrieving
        System.out.println(numbers.get(0));

        // Indexed for loop iteration
        System.out.println("\nIteration #1: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing items from the end (careful!)
        numbers.remove(numbers.size() - 1);

        // Removing the first item. This is VERY SLOW because it copies
        // the other items into the location of the removed item!
        numbers.remove(0);

        // Another method of indexing iterations
        System.out.println("\nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        // List interface ... Values is variable based on what it implements.
        // LinkedList vs ArrayList
        List<String> values = new ArrayList<String>();
    }
}
