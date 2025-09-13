/*

Target Sum Subset

variation of 0-1 knapsack

numbers[] = 4,2,7,1,3
Target Sum = 10
 */

import java.util.ArrayList;
import java.util.List;

public class E_Target_sum_subset_tabulation {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};
        int target = 10;

        boolean result = targetSumSubset(numbers, target);
        System.out.println("\nTarget sum possible? " + result);
    }

    public static boolean targetSumSubset(int[] numbers, int target) {
        boolean[][] dp = new boolean[numbers.length + 1][target + 1];

        // base case
        for (int i = 0; i <= numbers.length; i++) {
            dp[i][0] = true; // sum 0 is always possible
        }

        // fill DP
        for (int i = 1; i <= numbers.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (dp[i - 1][j]) {
                    dp[i][j] = true; // don't take current number
                } else if (j >= numbers[i - 1] && dp[i - 1][j - numbers[i - 1]]) {
                    dp[i][j] = true; // take current number
                }
            }
        }

        // print DP table
        printDP(dp, numbers, target);

        if (dp[numbers.length][target]) {
            System.out.println("\nSubsets that make sum " + target + ":");
            List<List<Integer>> subsets = new ArrayList<>();
            findSubsets(dp, numbers, numbers.length, target, new ArrayList<>(), subsets);

            // Print subsets
            for (List<Integer> subset : subsets) {
                System.out.println(subset);
            }

            System.out.println("Total subsets: " + subsets.size());
        }

        return dp[numbers.length][target];
    }

    // Backtracking function to extract subsets
    public static void findSubsets(boolean[][] dp, int[] numbers, int i, int j,
                                   List<Integer> current, List<List<Integer>> result) {
        if (j == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (i == 0) return;

        // Option 1: Exclude numbers[i-1]
        if (dp[i - 1][j]) {
            findSubsets(dp, numbers, i - 1, j, new ArrayList<>(current), result);
        }

        // Option 2: Include numbers[i-1]
        if (j >= numbers[i - 1] && dp[i - 1][j - numbers[i - 1]]) {
            current.add(numbers[i - 1]);
            findSubsets(dp, numbers, i - 1, j - numbers[i - 1], current, result);
        }
    }

    // Function to print DP matrix with headers
    public static void printDP(boolean[][] dp, int[] numbers, int target) {
        System.out.println("\nDP Table:");

        // Print column headers (sums)
        System.out.print("Num\\Sum ");
        for (int j = 0; j <= target; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();

        // Print each row
        for (int i = 0; i < dp.length; i++) {
            if (i == 0) {
                System.out.printf("%7s ", "0"); // No number row
            } else {
                System.out.printf("%7d ", numbers[i - 1]); // Actual number
            }

            for (int j = 0; j <= target; j++) {
                System.out.print((dp[i][j] ? "T  " : "F  "));
            }
            System.out.println();
        }
    }
 }