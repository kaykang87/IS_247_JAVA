/**
 * Created by kkang on 12/1/2016.
 */
public class Lab4_3 {
    //Given an array of ints, compute recursively the number of times that the
//value 9 appears in the array. The initial call will pass in index as 0.
//array9([1, 2, 9], 0) → 1
//array9([9, 9], 0) → 2
//array9([1, 2, 3, 4], 0) → 0

    public static int array9(int[] nums, int index) {
        if (nums.length == index) {
            return 0;
        }
        if (nums[index] == 9){
            return 1 + array9(nums, ++index);
        }
        return array9(nums, ++index);
    }

    public static void main(String[] args) {
        System.out.println(array9(new int[]{1, 2, 9, 9}, 0));
    }
}
