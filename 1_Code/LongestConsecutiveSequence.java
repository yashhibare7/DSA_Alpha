import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums); // Step 1: Sort the array

        int maxConsecutive = 1;
        int currentConsecutive = 1;

        // Step 2: Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Avoid counting duplicate numbers
                if (nums[i] == nums[i - 1] + 1) { // Check for consecutive numbers
                    currentConsecutive++;
                } else {
                    maxConsecutive = Math.max(maxConsecutive, currentConsecutive); // Step 3: Update max
                    currentConsecutive = 1; // Reset count for non-consecutive sequence
                }
            }
        }

        // Step 4: Return the maximum consecutive count
        return Math.max(maxConsecutive, currentConsecutive);
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2}; // Example array
        int longest = longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + longest);
    }
}

