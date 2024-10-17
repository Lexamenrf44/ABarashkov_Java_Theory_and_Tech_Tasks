package tech_tasks.array;

import java.util.*;

public class FindMaxIndexViaSortUsingStreamApi {
    public static void main(String[] args) {

        // Example array
        int[] arr = {4, 2, 9, 1, 5, 6};

        // Find the max index in the array before sorting
        int max = Arrays.stream(arr).max().getAsInt();

        // Sort the array in ascending order (modifies the original array)
        Arrays.sort(arr);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int maxIndex = Arrays.binarySearch(arr, max);

        // Assertion: Expecting the maximum value to be at index 2
        if (maxIndex == 5) {
            assert true;
            System.out.println("Test passed! The index of the maximum number is: " + maxIndex);
        } else {
            assert false : "Test failed! Expected index to be 5, but got " + maxIndex;
        }
    }
}
