package main.java.tech_tasks;

import java.util.*;

public class SearchInArrayViaSort {
    public static void main(String[] args) {
        // Example array
        int[] arr = {4, 2, 9, 1, 5, 6};  // Declare and initialize an array of integers

        // Sort the array in ascending order
        Arrays.sort(arr);  // Sorts the array in place (modifies the original array)

        // Find the maximum value after sorting
        int max = arr[arr.length - 1];  // The maximum value is the last element after sorting

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));  // Print the sorted array

        // Output the maximum number
        System.out.println("The maximum number is: " + max);  // Print the maximum value
    }
}
