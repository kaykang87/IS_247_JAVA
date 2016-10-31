package Ch20_List_Stack_Queues_Iterators;
import java.util.*;

/**
 * Created by kkang on 10/20/2016.
 */
public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        // Prints out all the elements in collection
        System.out.println("A list of cities in collection1:");
        System.out.println(collection1);

        // Returns boolean if the collection contains the requested element
        System.out.println("\nIs Dallas in collection1? "
                + collection1.contains("Dallas"));

        // Returns the size of the collection after removing "Dallas"
        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size()
                + " cities are in collection1 now");

        // Creates a new Collection
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        // Adds collection 2 to collection 1 and prints them out
        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        // Returns the element that is in both collection 1 & colleciton 2
        c1 = (ArrayList<String>) (collection1.clone());
        c1.retainAll(collection2);
        System.out.print("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        // Removes all of collection 2 and prints out only the items in Collection 1
        // Does not Printout overlapping element
        c1 = (ArrayList<String>) (collection1.clone());
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
    }

}
