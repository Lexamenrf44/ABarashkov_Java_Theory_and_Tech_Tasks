package main.java.tech_tasks.array;

import java.util.Arrays;

public class FindMaxIndexUsingStreamApi {
    public static void main(String[] args) {

        // Example array
        int[] arr = {4, 2, 9, 1, 5, 6};

        // Find the max index in the array
        int max = Arrays.stream(arr).max().getAsInt();

        // Output the index of the maximum value
        System.out.println("The index of the maximum number is: " + Arrays.binarySearch(arr, max));
    }
}
