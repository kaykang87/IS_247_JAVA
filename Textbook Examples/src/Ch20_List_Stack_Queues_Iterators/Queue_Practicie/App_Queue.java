package Ch20_List_Stack_Queues_Iterators.Queue_Practicie;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by kyong on 10/28/2016.
 */

//Queue = First in First Out
public class App_Queue {
    public static void main(String[] args){
        // First in first out structure with limit of 3 items
        // Bounded queue
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        // Throw no such element exception -- no items in queue
//        System.out.println("Head of queue is: " + q1.element());

        // Adding integer values to the queue
        q1.add(10);
        q1.add(20);
        q1.add(30);

        // Returns the first element. Throws exception if it does not work
        System.out.println("Head of the queue is: " + q1.element());

        // Try & Catch error for trying to add 4th item to 3 item queue
        try{
            q1.add(40);
        } catch (IllegalStateException e){
         System.out.println("Trying to add to many items to the que. Limit is 3");
        }

        // Putting the added integers into the for loop
        for(Integer value: q1){
            System.out.println("Queue Value: " + value);
        }

        // Removes the head of the queue
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());

        // Try and Catch block to throw an error for trying to remove 4th item from 3 item queue
        try{
            System.out.println("Removed from queue: " + q1.remove());
        } catch(NoSuchElementException e){
            System.out.println("Tried to remove too many items from queue:");
        }

        //////////////////////////////////////////////////////////////////////
        ///////            Using Different Methods of Queue          ////////
        //////             Peek, Offer, Poll                         ////////
        //////      These methods throws "null" not exceptions       ////////
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        // Offers to add a value IF there is space. Returns FALSE if it can't add the item
        q2.offer(10);
        q2.offer(20);

        // Returns the first Value. Returns null if it doesn't exist
        System.out.println("\nQueue 2: peek: " + q2.peek());

        if(q2.offer(30) == false){
            System.out.println("Offer failed to add third item. ");
        }

        for(Integer value: q2){
            System.out.println("Queue 2 Value: " + value);
        }

        // Poll is like Remove but instead of removing an exception, it throws a null
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
    }
}
