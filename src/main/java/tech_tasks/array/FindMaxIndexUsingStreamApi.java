package tech_tasks.array;

import java.util.Arrays;

public class FindMaxIndexUsingStreamApi {
    public static void main(String[] args) {

        // Example array
        int[] arr = {4, 2, 9, 1, 5, 6};

        // Find the max value in the array
        int max = Arrays.stream(arr).max().getAsInt();

        int maxIndex = Arrays.binarySearch(arr, max);

        System.out.println("The index of the maximum number is: " + maxIndex);

        // Assertion: Expecting the maximum value to be at index 2
        if (maxIndex == 2) {
            assert true;
            System.out.println("Test passed! The index is as expected: " + maxIndex);
        } else {
            assert false : "Test failed! Expected index to be 2, but got " + maxIndex;
        }
    }
}
