package Ch21_Sets_Maps.map_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by kkang on 11/1/2016.
 * HashMap does not sort in anyway
 * LinkedHashMap keeps Keys and Values in the same order that you added
 * TreeMap sorts in Natural Order Sorts in Natural Order. Ascending Integers/Alphabets
 *
 * This Program passes the Map Interface in the parameter
 **/
public class App_SortedMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // Map<Integer, String> hashMap = new HashMap<Integer, String>();

        // Keys and Values stays in the same order that you added to the map
        // in LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        //Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        // Sorts in Natural Order. Ascending Integers/Alphabets
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        //Map<Integer, String> treeMap = new TreeMap<>();

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(9, "Fox");
        map.put(4, "Wolf");
        map.put(8, "Dog");
        map.put(1, "Cat");
        map.put(2, "Turtle");
        map.put(3, "Rabbit");
        map.put(0, "Tiger");
        map.put(15, "Dragon");

        // Iterating through the Map
        for (Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
