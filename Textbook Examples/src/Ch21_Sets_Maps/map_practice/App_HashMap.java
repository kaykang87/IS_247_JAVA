package Ch21_Sets_Maps.map_practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kkang on 11/1/2016.
 * In HashMap. One pair is called the key. Other is called the value.
 * HashMap is not sorted in anyway. Each Iteration could be different
 *
 * This program shows how HashMap is stored and printed through
 * iteration
 */

public class App_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // put is the adding method
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(8, "Eight");
        map.put(4, "Four");
        map.put(2, "Two");

        // this '6' key overrides the first '6'
        map.put(6, "Hello");

        // Gets the map key of (x) and stores into String text
        String text = map.get(6);

        // Prints out "Hello"
        System.out.println(text);

        // Iterating through the HashMap using the Map Interface
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            // Prints out all the iteration of keys in the map
            System.out.println(key + ": " + value);
        }
    }
}
