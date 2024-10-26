package helpers;

public class HelpMethods {

    // A static method named `printFizzBuzz` is defined.
    // This method contains the loop that will implement the FizzBuzz logic.
    public static void printFizzBuzzWithCounter() {

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
            // Display how many times "FizzBuzz" was printed.
        }
    }

    // Brute force method to find the maximum value in an array
    public static int findMaxBruteForce(int[] array) {

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

    // Method to find the previous value in an array for a given index
    public static int findPrevious(int[] array, int index) {

        // Check if the current index is greater than 0 (to ensure there is a previous number)
        if (index > 0) {
            return array[index - 1];  // Return the previous number
        } else {
            return -1;  // Return -1 if no previous number exists (i.e., index is 0)
        }
    }

    public static boolean validateRailwayTime(String time) {

        // Parse hours and minutes directly and return the result of range checks
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        // Return true only if hours are between 00-23 and minutes are between 00-59
        return hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59;
    }

    public static boolean validateStandardTime(String time) {

        // Parse the hours and minutes, and check their validity in one return statement
        return (time.length() == 5) &&
                (time.charAt(2) == ':') &&  // Ensure the third character is a colon
                (Integer.parseInt(time.substring(0, 2)) >= 1 && Integer.parseInt(time.substring(0, 2)) <= 12) && // Valid hours (01-12)
                (Integer.parseInt(time.substring(3, 5)) >= 0 && Integer.parseInt(time.substring(3, 5)) <= 59); // Valid minutes (00-59)
    }

    // Method to find the difference between maximum and minimum elements
    public static int CalculateArrayDifference(int[] inputArray)  {

        // Initialize the indices of minimum and maximum elements
        int indexOfMinimum = 0;
        int indexOfMaximum = 0;

        // Traverse the array to find indices of the minimum and maximum values
        for (int i = 1; i < inputArray.length; i++) {
            // Check if the current element is smaller than the current minimum
            if (inputArray[i] < inputArray[indexOfMinimum]) {
                indexOfMinimum = i;
            }

            // Check if the current element is greater than the current maximum
            if (inputArray[i] > inputArray[indexOfMaximum]) {
                indexOfMaximum = i;
            }
        }

        // Return the difference between the maximum and minimum values
        return inputArray[indexOfMaximum] - inputArray[indexOfMinimum];
    }

    // Method to find maximum subarray - Kadane's Algorithm
    public static int findMaxSubArray(int[] nums) {

        // Initialize current sum and max sum variables
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current sum
            currentSum += nums[i];

            // Update max sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);

            // If current sum drops below 0, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Return the maximum sum found
        return maxSum;
    }
}
