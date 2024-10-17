package tech_tasks.array;

import helpers.*;

import java.util.Arrays;

public class FindPreviousIndexViaMethodCallInSortedArray {
    public static void main(String[] args) {

        // Example array
        int[] arr = {8, 6, 10, 4, 2};  // Declare and initialize an array of integers

        // Sort the array in ascending order
        Arrays.sort(arr);  // Sorts the array in place (modifies the original array)

        // Current index can be set manually but what for
        int currentIndex = arr.length - 1;  // Automatically set to last element's index

        // Find the previous number
        int previous = HelpMethods.findPrevious(arr, currentIndex);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));  // Print the sorted array

        // Output the previous number
        System.out.println("The previous number is: " + Arrays.binarySearch(arr, previous));  // Print the previous number if it exists
    }
}
