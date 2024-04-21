import java.util.*;

public class LongestConsecutiveSequence_num {
    public static List<Integer> longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums); // Step 1: Sort the array

        int maxConsecutive = 1;
        int currentConsecutive = 1;
        int startOfLongest = nums[0]; // Start of the longest consecutive sequence
        int endOfLongest = nums[0];   // End of the longest consecutive sequence

        // Step 2: Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Avoid counting duplicate numbers
                if (nums[i] == nums[i - 1] + 1) { // Check for consecutive numbers
                    currentConsecutive++;
                    if (currentConsecutive > maxConsecutive) { // Update longest sequence
                        maxConsecutive = currentConsecutive;
                        startOfLongest = nums[i - maxConsecutive + 1]; // Update start of longest sequence
                        endOfLongest = nums[i]; // Update end of longest sequence
                    }
                } else {
                    currentConsecutive = 1; // Reset count for non-consecutive sequence
                }
            }
        }

        // Construct and return the longest consecutive sequence
        List<Integer> longestSequence = new ArrayList<>();
        for (int num = startOfLongest; num <= endOfLongest; num++) {
            longestSequence.add(num);
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2}; // Example array
        List<Integer> longestSequence = longestConsecutive(nums);
        
        System.out.println("Longest consecutive sequence: " + longestSequence);
    }
}

