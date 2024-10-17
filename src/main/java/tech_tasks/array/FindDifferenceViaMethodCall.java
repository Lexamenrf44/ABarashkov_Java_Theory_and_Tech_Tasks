package tech_tasks.array;

import helpers.*;

/*

Find the difference between its maximum and minimum elements in array

*/

public class FindDifferenceViaMethodCall {

    // Main method for testing the solution
    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 8, 7};
        int target = 8;
        int difference = HelpMethods.CalculateArrayDifference(arr); // Call the solution method
        System.out.println("Difference between max and min: " + difference); // Print the result

        // Assertion: Expecting the difference to be 8

        if (difference == 8) {
            assert true;
            System.out.println("Test passed! Expected: " + difference);
        } else {
            assert false : "Test failed! Expected difference to be " + target + " but got " + difference;
        }

        // assert difference == 8 : "Test failed! Expected difference to be 8, but got " + difference;
    }
}
