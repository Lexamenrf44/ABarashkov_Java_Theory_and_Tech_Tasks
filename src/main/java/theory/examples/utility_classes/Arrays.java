package theory.examples.utility_classes;

/*

Arrays

A utility class for working with arrays, including static methods for sorting, searching, copying, and comparing arrays.

*/

public class Arrays {

    public static void main(String[] args) {

        // Create an array of integers
        int[] numbers = {3, 5, 1, 2, 4};

        // Sort the array
        java.util.Arrays.sort(numbers);  // Sorts in ascending order

        // Print the sorted array
        System.out.println(java.util.Arrays.toString(numbers));  // Output: [1, 2, 3, 4, 5]
    }
}
