package helpers;

public class FindMaxMethods {
    // Brute force method to find the maximum value in an array
    public static int findMaxBruteForce(int[] array) {

        int max = array[0];  // Assume the first element is the largest for now

        // Loop through the rest of the array
        for (int i = 1; i < array.length; i++) {
            // Check if the current element is greater than the current max
            if (array[i] > max) {
                max = array[i];  // Update max if we found a bigger number
            }
        }

        return max;  // Return the largest number found
    }

    // Method to find maximum subarray - Kadane's Algorithm
    public static int findMaxSubArray(int[] nums) {

        // Initialize current sum and max sum variables
        int currentSum = 0;
        int max = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current sum
            currentSum += nums[i];

            // Update max sum if the current sum is greater
            max = Math.max(max, currentSum);

            // If current sum drops below 0, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Return the maximum sum found
        return max;
    }
}
