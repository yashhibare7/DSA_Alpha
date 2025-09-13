/*
Example 1:

          Input: nums = [1,2,3,1]

          Output: true

          Explanation: The element 1 occurs at the indices 0 and 3.

Example 2:

          Input: nums = [1,2,3,4]

          Output: false

          Explanation: All elements are distinct.
 */
import java.util.Arrays;

public class D_Contains_duplicate {
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        boolean a = containsDuplicate(nums);
        System.out.println("Contains duplicate in array = "+ a);
    }
}