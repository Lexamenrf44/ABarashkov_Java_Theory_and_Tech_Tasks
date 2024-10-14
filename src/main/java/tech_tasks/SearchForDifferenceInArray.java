package main.java.tech_tasks;

import main.java.helpers.*;

/*

Find the difference between its maximum and minimum elements in array

*/

public class SearchForDifferenceInArray {

    // Main method for testing the solution
    public static void main(String[] args) {
        HelpMethods.CalculateArrayDifference CalculateArrayDifference = new HelpMethods.CalculateArrayDifference(); // Create an instance of the class
        int[] arr = {3, 5, 1, 9, 7}; // Example array
        int difference = CalculateArrayDifference.solution(arr); // Call the solution method
        System.out.println("Difference between max and min: " + difference); // Print the result
    }

}
