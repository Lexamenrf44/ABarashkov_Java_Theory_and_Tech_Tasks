package main.java.helpers;

import java.util.*;

public class HelpMethods {

    // A static method named `printFizzBuzz` is defined. This method contains the loop that will implement the FizzBuzz logic.
    public static void printFizzBuzz() {

        // Initialize counters for Fizz, Buzz, and FizzBuzz.
        int fizzCount = 0;  // This variable will count how many times "Fizz" is printed.
        int buzzCount = 0;  // This variable will count how many times "Buzz" is printed.
        int fizzBuzzCount = 0;  // This variable will count how many times "FizzBuzz" is printed.

        for (int i = 0; i <= 50; i++) {
            // A `for` loop is used to iterate over the numbers from 0 to 50 (inclusive).
            // 'i' is the loop counter, starting from 0, and increasing by 1 in each iteration.

            if (i % 3 == 0 && i % 5 == 0) {
                // Checks if the current number 'i' is divisible by both 3 and 5.
                // If the condition is true, it means 'i' is a multiple of both 3 and 5.

                System.out.println("main.java.tech_tasks.FizzBuzz");
                fizzBuzzCount++;  // Increment the FizzBuzz counter.

                // If 'i' is divisible by both 3 and 5, it prints "main.java.tech_tasks.FizzBuzz" to the console.
            } else if (i % 3 == 0) {
                // If the number is not divisible by both 3 and 5, this block checks if 'i' is divisible by 3.

                System.out.println("Fizz");
                fizzCount++;  // Increment the Fizz counter.

                // If 'i' is divisible by 3, it prints "Fizz".
            } else if (i % 5 == 0) {
                // If the number is not divisible by 3, this block checks if 'i' is divisible by 5.

                System.out.println("Buzz");
                buzzCount++;  // Increment the Buzz counter.

                // If 'i' is divisible by 5, it prints "Buzz".
            } else {
                // If none of the previous conditions are met (i.e., the number is not divisible by 3 or 5), it goes to the else block.
                System.out.println(i);
                // Prints the number 'i' itself, since it is neither a multiple of 3 nor 5.
            }

            // After the loop, print the total counts for Fizz, Buzz, and FizzBuzz.
            System.out.println("\nSummary:");
            System.out.println("Fizz was printed " + fizzCount + " times.");
            // Display how many times "Fizz" was printed.

            System.out.println("Buzz was printed " + buzzCount + " times.");
            // Display how many times "Buzz" was printed.

            System.out.println("FizzBuzz was printed " + fizzBuzzCount + " times.");
            // Display how many times "FizzBuzz" was printed.        }
        }
    }

    // Method to find the maximum number in an array
    public static int findMax(int[] array) {

        int max = array[0];  // Assume the first element is the largest for now

        // Loop through the rest of the array
        for (int i = 1; i < array.length; i++) {
            // Check if the current element is greater than the current max
            if (array[i] > max) {
                max = array[i];  // Update max if we found a bigger number
            }
        }

        return max;  // Return the largest number found
    }

    // Method to find the previous number in an array for a given index
    public static int findPrevious(int[] array, int index) {

        int previous = array[0];  // Assume the first element is the largest for now

        // Check if the current index is greater than 0 (to ensure there is a previous number)
        if (index > 0) {
            return array[index - 1];  // Return the previous number
        } else {
            return -1;  // Return -1 if no previous number exists (i.e., index is 0)
        }
    }

    // Method to find two numbers that add up to the target
    public static int[] findTwoSum(int[] nums, int target) {

        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Calculate the complement (target - current number)

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If complement exists, return its index and the current index
                return new int[] { map.get(complement), i };
            }

            // If complement does not exist, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (shouldn't happen given problem constraints)
        return new int[] {};
    }
}
