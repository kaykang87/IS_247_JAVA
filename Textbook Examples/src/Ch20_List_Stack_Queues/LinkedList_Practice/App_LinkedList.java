package Ch20_List_Stack_Queues.LinkedList_Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Comparison of LinkedList vs ArrayList
 * ArrayList is optimal for adding/removing items at the end of the List or CLOSER to the end
 * ArrayList manage arrays internally
 * [0][1][2][3][4][5]...
 * LinkedList is optimal for anywhere else. LinkedList doesn't really care where you add the items
 * LinkedList consists of elements where each element has a reference to the previous and next element
 * [0] -> [1] -> [2] -> [3] -> [4] ......
 *     <-     <-     <-     <-
 */
public class App_LinkedList {

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();            // ArrayList can be used to add/remove items at the end of the list
        LinkedList<Integer> linkedList = new LinkedList<Integer>();  // LinkedList can be used to add/remove items at the beginning/middle

        doTimings("ArrayList", arrayList);          // Pass String and ArrayList to doTimings method
        doTimings("LinkedList", linkedList);        // Pass String and LinkedList to doTimings method
    }

    // Method to pass anything that implements the List interface
    private static void doTimings(String type, List<Integer> list){

        for(int i=0; i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // Time test of adding items at the end of list
//        for(int i=0; i<1E5; i++){
//            list.add(i);
//        }

        // Time test of adding items elsewhere in list
//        for(int i=0; i<1E5; i++){
//            list.add(0, i);                // Add i to index 0(beginning of the list)
//        }

        // Time test of adding items 100 elements from the end
        for(int i=0; i<1E5; i++){
            list.add(list.size() - 100,i);              // Adding items at a hundred elements from the end
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
