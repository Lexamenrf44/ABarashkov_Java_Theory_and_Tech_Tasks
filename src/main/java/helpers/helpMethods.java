package main.java.helpers;

public class helpMethods {

    // Method to find the maximum number in an array
    public static int findMax(int[] array) {
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
}
