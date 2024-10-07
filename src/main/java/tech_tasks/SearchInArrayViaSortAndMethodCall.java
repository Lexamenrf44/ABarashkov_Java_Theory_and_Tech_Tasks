package main.java.tech_tasks;

import main.java.helpers.*;
import java.util.*;

public class SearchInArrayViaSortAndMethodCall {
    public static void main(String[] args) {
        // Example array
        int[] arr = {7, 2, 10, 5, 3};  // Declare and initialize an array of integers

        // Sort the array in ascending order
        Arrays.sort(arr);  // Sorts the array in place (modifies the original array)

        // Example current index
        int currentIndex = 4;  // Assume we're looking for the previous number at index 4 (which is 6)

        // Find the previous number
        int previous = helpMethods.findPrevious(arr, currentIndex);

        // Find the maximum value after sorting
        int max = arr[arr.length - 1];  // The maximum value is the last element after sorting

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));  // Print the sorted array

        // Output the previous number
        if (previous != -1) {
            System.out.println("The previous number is: " + previous);  // Print the previous number if it exists
        } else {
            System.out.println("No previous number exists.");  // If there is no previous number (e.g., index 0)
        }

        // Output the maximum number
        System.out.println("The maximum number is: " + max);  // Print the maximum value
    }
}
