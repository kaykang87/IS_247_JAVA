package textbookChapter19EX;

/**
 * Created by kkang on 10/20/2016.
 */
public class WildCardNeedDemo {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1); // 1 is autoboxed into new Integer(1)
        intStack.push(2);
        intStack.push(-2);

        //Error: intStack is not an instance of GenericStack<Number>.
        //The fact is that Integer is a subtype of Number, but
        //GenericStack<Integer> is not a subtype of GenericStack<Number>.
        System.out.print("The max number is " + max(intStack));
    }

    /**
     * Find the maximum in a stack of numbers
     * @param stack
     */
    public static double max(GenericStack<Integer> stack) {
        double max = stack.pop().doubleValue(); // Initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}