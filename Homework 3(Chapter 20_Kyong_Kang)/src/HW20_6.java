import org.apache.commons.lang3.time.StopWatch;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * (Use iterators on linked lists)
 * Write a test program that stores 5 million integers in a linked
 * list and test the time to traverse the list using an iterator vs.
 * using the get(index) method.
 *
 * Created by kkang on 10/27/2016.
 */
public class HW20_6 {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++){
            list.add(i);
        }
        Iterator<Integer> timeTaken = list.iterator();
        long start = System.currentTimeMillis();
        stopWatch.start();
        while (timeTaken.hasNext()){
            timeTaken.next();
        }
        stopWatch.stop();
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + stopWatch.getTime() + " ms for LinkedList");
        System.out.println("Time taken: " + (end-start) + " ms for LinkedList");

        long startGet = System.currentTimeMillis();
        stopWatch.reset();
        stopWatch.start();
        for (int i = 0; i < 5000; i++) {
            list.get(i);
        }
        stopWatch.stop();
        long endGet = System.currentTimeMillis();
        System.out.println("Time taken: " + stopWatch.getTime() + " ms for get(index)");
        System.out.println("Time taken: " + (endGet-startGet) + " ms for get(index)");
        stopWatch.reset();





//    private static void doTimings(String type, List<Integer> list) {
//
//        long start = System.currentTimeMillis();
//
//        long end = System.currentTimeMillis();
//        System.out.println("Time taken: " + (end-start) + " ms for " + type);


//        LinkedList<String> animals = new LinkedList<>();
//
//        animals.add("fox");
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("wolf");
//
//        // Iteration
//        Iterator<String> timeTaken = animals.iterator();
//
//        while(timeTaken.hasNext()) {
//            String value = timeTaken.next();
//            System.out.println(value);
//
//            if(value.equals("cat")){
//                timeTaken.remove();
//            }
//        }
//
//        System.out.println();
//
//        for(String animal: animals){
//            System.out.println(animal);
//        }
    }
}

