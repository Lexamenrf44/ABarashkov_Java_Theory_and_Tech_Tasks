package tech_tasks.array;

import helpers.*;

import java.util.Arrays;

public class FindPreviousIndexViaMethodCallInSortedArray {
    public static void main(String[] args) {

        // Declare and initialize an array of integers
        int[] arr = {8, 6, 10, 4, 2};

        // Sorts the array in place (modifies the original array)
        Arrays.sort(arr);

        // Set index of maximum value
        int maxIndex = arr.length - 1;

        // Find the previous number via method call
        int previousValue = HelpMethods.findPrevious(arr, maxIndex);

        // Convert found pervious number to index
        int previousIndex = Arrays.binarySearch(arr, previousValue);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Assertion to check if the previous index is correct
        if (previousIndex == 3) {
            assert true;
            System.out.println("Test passed! The previous index is: " + previousIndex);
        } else {
            assert false : "Test failed! Expected previous index to be 3, but got: " + previousIndex;
        }
    }
}