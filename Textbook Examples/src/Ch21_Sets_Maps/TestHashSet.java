/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * A set is a collection that contains no duplicate elements, and whose elements are in no particular order.
 *
 * HashSet implies it's based on a hash table. Hash table order depends
 * primarily on the hashcodes of items in the set, not on insertion order.
 */

package Ch21_Sets_Maps;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet<>();

        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        // Display the elements in the hash set
        for (String s : set) {
            System.out.println(s.toUpperCase() + " ");
        }
    }
}
