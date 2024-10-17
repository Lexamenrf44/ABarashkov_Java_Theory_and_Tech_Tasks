package tech_tasks.array;

import java.util.*;

public class FindMaxIntViaSort {
    public static void main(String[] args) {

        // Example array
        int[] arr = {4, 2, 9, 1, 5, 6};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Find the maximum value after sorting
        int max = arr[arr.length - 1];

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        if (max == 9) {
            assert true;
            System.out.println("Test passed! The maximum number is: " + max);
        } else {
            assert false : "Test failed! The maximum number is: " + max;
        }
    }
}
