package Ch21_Sets_Maps.map_practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kkang on 11/1/2016.
 * Set includes methods like
 * equals, hashCode, isEmpty, iterator, remove, removeAll, retainAll
 * size, toArray
 */
public class App_Sets {
    public static void main(String[] args) {

        // HashSet does not Retain Order
        Set<String> set1 = new HashSet<String>();

        // LinkedHashSet remembers the order you added items in
        Set<String> set2 = new LinkedHashSet<>();

        // TreeSet sorts in natural order
        Set<String> set3 = new TreeSet<>();

        if (set1.isEmpty()){
            System.out.println("Set is Empty at start");
        }

        // Adds to HashSet which does not order/sort items. It is Random
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Mouse");
        set1.add("Rabbit");
        set1.add("Skunk");

        if (set1.isEmpty()){
            System.out.println("Set is Empty at start (no!) ");
        }

        // Adds to LinkedHashSet to keep the order it was entered in
        set2.add("Dog");
        set2.add("Cat");
        set2.add("Mouse");
        set2.add("Rabbit");
        set2.add("Skunk");
        // Adds to TreeSet to sort in natural order
        set3.add("Dog");
        set3.add("Cat");
        set3.add("Mouse");
        set3.add("Rabbit");
        set3.add("Skunk");

        // Will not Print because Set can only contain "Unique' items
        set1.add("Mouse");

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        ///////////////// Iteration /////////////////////////
        for (String element: set1) {
            System.out.println(element);
        }

        /////////////// Does Set contains a given item? ////////////
        if (set1.contains("aardvark")){
            System.out.println("Contains aardvark");
        }

        if (set1.contains("Cat")){
            System.out.println("Contains Cat");
        }
    }
}
