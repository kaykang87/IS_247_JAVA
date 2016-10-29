package Ch21_Sets_Maps;

import java.util.*;

/**
 *
 */

public class TestTreeSet {
    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet<String>();

        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println("Sorted tree set: " + treeSet);

        // Use the methods in SortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        // Showing elements higher than "New York"
        System.out.println("headSet(\"New York\"): " +
                treeSet.headSet("New York"));
        // Showing elements lower or equal to "New York"
        System.out.println("tailSet(\"New York\"): " +
                treeSet.tailSet("New York"));

        // Use the methods in NavigableSet interface
        // Removing the first item
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        // Removing the last item
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
    }
}