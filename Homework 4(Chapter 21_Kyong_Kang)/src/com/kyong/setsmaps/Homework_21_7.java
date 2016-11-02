package com.kyong.setsmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by kkang on 11/1/2016.
 * (Revise Listing 21.9, CountOccurrenceOfWords.java)
 * Rewrite Listing 21.9 to display the words in ascending order
 * of occurrence counts. (Hint: Create a class named WordOccurrence
 * that implements the Comparable interface. The class contains two fields,
 * word and count. The compareTo method compares the counts. For each pair
 * in the hash set in Listing 21.9, create an instance of WordOccurrence and
 * store it in an array list. Sort the array list using the Collections.sort method.
 * What would be wrong if you stored the instances of WordOccurrence in a tree set?)
 **/
public class Homework_21_7 {
    public static void main(String[] args) {
        String string = "Hello. My name is Kyong Kang. " + "I am a Java Student. " +
                "Have fun!";

        Map<String, Integer> map = new TreeMap<>();

        String[] word = string.split("[\\s+]");
        for (String word1 : word) {
            String count = word1.toLowerCase();
            if (count.length() > 0) {
                if (!map.containsKey(count)) {
                    map.put(count, 1);
                } else {
                    int value = map.get(count);
                    value++;
                    map.put(count, value);
                }
            }
        }

        ArrayList<WordOccurrence> arrayList = new ArrayList<>();

        map.forEach((k, v) -> arrayList.add(new WordOccurrence(k, v)));
        Collections.sort(arrayList);
        arrayList.forEach((word2) -> System.out.println(word2.word + "\t" + word2.count));
    }

    private static class WordOccurrence implements Comparable<WordOccurrence> {
        int count;
        String word;

        public WordOccurrence(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(WordOccurrence o) {
            if (o.count > count)
                return -1;
            else if (o.count < count)
                return 1;
            else
                return 0;
        }
    }
}
