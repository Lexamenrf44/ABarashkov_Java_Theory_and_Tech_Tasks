package main.java.tech_tasks;

import main.java.helpers.*;

public class SearchInArrayViaMethodCall {
    public static void main(String[] args) {

        // Example array
        int[] arr = {7, 2, 10, 5, 3};  // Declare and initialize an array of integers

        // Via method call to find the max number
        int max = HelpMethods.findMax(arr);

        // Print the result
        System.out.println("The maximum number is: " + max);  // Output the maximum number
    }
}
