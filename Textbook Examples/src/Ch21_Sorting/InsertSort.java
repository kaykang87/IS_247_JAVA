/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch21_Sorting;

public class InsertSort {

    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            /**
             * Insert list[i] into a sorted sublist list[0..i-1] so that
             * list[0..i] is sorted.
             */
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            // Insert the current element into list[k + 1]
            list[k + 1] = currentElement;
        }

        return list;
    }

    public static void main(String[] args) {

        //Starting Array
        int[] collections = {2, 9, 5, 4, 8, 1, 6};

        //Before the sort
        System.out.print("Before:\t");
        for (int collection : collections) {
            System.out.print(collection + " ");
        }
        
        System.out.println("");
        
        //Creating and setting the reference variable collectionResults
        int[] collectionResults = insertionSort(collections);
        
        //After the sort
        System.out.print("After:\t");
        for (int collectionResult : collectionResults) {
            System.out.print(collectionResult + " ");
        }
        
        System.out.println("");
    }
}
