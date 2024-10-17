package tech_tasks.array;

import helpers.*;
import java.util.*;

public class FindPreviousIntViaMethodCallInSortedArray {
    public static void main(String[] args) {

        // Declare and initialize an array of integers
        int[] arr = {8, 6, 10, 4, 2};

        // Sorts the array in place (modifies the original array)
        Arrays.sort(arr);

        // Set index of maximum value
        int maxIndex = arr.length - 1;

        // Find the previous number
        int previousValue = HelpMethods.findPrevious(arr, maxIndex);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Assertion to check if the previous index is correct
        if (previousValue == 8) {
            assert true;
            System.out.println("Test passed! The previous value is: " + previousValue);
        } else {
            assert false : "Test failed! Expected previous value to be 8, but got: " + previousValue;
        }
    }
}
