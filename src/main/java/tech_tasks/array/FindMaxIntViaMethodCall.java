package tech_tasks.array;

import helpers.*;

public class FindMaxIntViaMethodCall {
    public static void main(String[] args) {

        // Example array
        int[] arr = {7, 2, 11, 5, 3};  // Declare and initialize an array of integers

        // Via method call to find the max number
        int max = HelpMethods.findMaxBruteForce(arr);

        if (max == 10) {
            assert true;
            System.out.println("Test passed! The maximum number is: " + max);
        } else {
            assert false : "Test failed! The maximum number is: " + max;
        }
    }
}
