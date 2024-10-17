package tech_tasks.array;

import helpers.*;

public class FindMaxIntViaMethodCall {
    public static void main(String[] args) {

        // Example array
        int[] arr = {7, 2, 10, 5, 3};  // Declare and initialize an array of integers

        // Via method call to find the max number
        int max = HelpMethods.findMaxBruteForce(arr);

        // Print the result
        System.out.println("The maximum number is: " + max);  // Output the maximum number
    }
}
