package helpers;

import java.util.HashMap;

public class FindTwoSumMethods {

    // Method to find two numbers that add up to the target
    public static int[] findTwoSumHashMap(int[] nums, int target) {

        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Calculate the complement (target - current number)

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If complement exists, return its index and the current index
                return new int[] { map.get(complement), i };
            }

            // If complement does not exist, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (shouldn't happen given problem constraints)
        return new int[] {};
    }

    public static int[] findTwoSumBruteForce(int[] nums, int target) {
        // Loop through each element in the array with index i
        for (int i = 0; i < nums.length; i++) {

            // For each element at index i, loop through the remaining elements with index j
            for (int j = i + 1; j < nums.length; j++) {

                // Check if the sum of the elements at indices i and j equals the target
                if (nums[i] + nums[j] == target) {

                    // If a match is found, return the indices of the two elements as an array
                    return new int[] { i, j };
                }
            }
        }

        // If no two elements add up to the target, return an empty array
        return new int[] {};  // Return empty if no solution found
    }

    public static int[] findTwoSumTwoPointerApproach(int[] nums, int target) {
        // Initialize two pointers at the start and end of the array
        int left = 0;
        int right = nums.length - 1;

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the sum of the elements at the current pointers
            int currentSum = nums[left] + nums[right];

            // Check if the current sum matches the target
            if (currentSum == target) {
                // Return indices incremented by 1 for a 1-based result
                return new int[]{left + 1, right + 1};
            }
            // If current sum is less than target, move the left pointer to the right
            else if (currentSum < target) {
                left++;
            }
            // If current sum is greater than target, move the right pointer to the left
            else {
                right--;
            }
        }
        // Return an empty array if no solution is found
        return new int[]{};
    }
}
