package main.java.tech_tasks.array;

import main.java.helpers.*;

/*

Find the difference between its maximum and minimum elements in array

*/

public class FindDifferenceViaMethodCall {

    // Main method for testing the solution
    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 9, 7}; // Example array
        int difference = HelpMethods.CalculateArrayDifference(arr); // Call the solution method
        System.out.println("Difference between max and min: " + difference); // Print the result

        // Assertion: Expecting the difference to be 8
        assert difference == 8 : "Test failed! Expected difference to be 8, but got " + difference;
    }
}
