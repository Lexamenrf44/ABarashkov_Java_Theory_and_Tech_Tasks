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

        // Output the index of the maximum value
        System.out.println("The index of the maximum number is: " + Arrays.binarySearch(arr, max));
    }
}
