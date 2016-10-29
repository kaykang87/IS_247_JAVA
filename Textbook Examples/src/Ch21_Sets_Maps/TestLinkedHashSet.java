package Ch21_Sets_Maps;

import java.util.*;

/**
 * LinkedHashSet can display the variables in order by using iterator
 */

public class TestLinkedHashSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);                 // LinekedHashSet

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next().toUpperCase() + " ");

    }
}
