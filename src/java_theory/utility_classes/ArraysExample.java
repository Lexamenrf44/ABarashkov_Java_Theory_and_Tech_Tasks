package java_theory.utility_classes;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {3, 5, 1, 2, 4};

        // Sort the array
        Arrays.sort(numbers);  // Sorts in ascending order

        // Print the sorted array
        System.out.println(Arrays.toString(numbers));  // Output: [1, 2, 3, 4, 5]
    }
}
