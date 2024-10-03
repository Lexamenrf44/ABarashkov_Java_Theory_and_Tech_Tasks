package java_theory.other_examples_of_classes;

/*

Array

Data structure that stores a fixed-size sequential collection of elements of the same type.
Arrays are used to store multiple values in a single variable, which makes it easier to manage and manipulate data.
All elements in an array must be of the same data type

*/

public class DescribeArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements by their index
        System.out.println("First element: " + numbers[0]);  // Output: First element: 10
        System.out.println("Second element: " + numbers[1]); // Output: Second element: 20

        // Loop through the array and print each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}

