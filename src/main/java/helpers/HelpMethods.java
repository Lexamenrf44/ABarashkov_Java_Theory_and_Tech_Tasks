package helpers;

public class HelpMethods {

    public static void printFizzBuzzWithCounter() {

        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;

        for (int i = 0; i <= 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("main.java.tech_tasks.FizzBuzz");
                fizzBuzzCount++;

            } else if (i % 3 == 0) {

                System.out.println("Fizz");
                fizzCount++;

            } else if (i % 5 == 0) {

                System.out.println("Buzz");
                buzzCount++;

            } else {
                System.out.println(i);
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

    public static int findArrayDifferenceLinearScan(int[] inputArray)  {

        int indexOfMinimum = 0;
        int indexOfMaximum = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[indexOfMinimum]) {
                indexOfMinimum = i;
            }
            if (inputArray[i] > inputArray[indexOfMaximum]) {
                indexOfMaximum = i;
            }
        }

        return inputArray[indexOfMaximum] - inputArray[indexOfMinimum];
    }

}
