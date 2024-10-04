// Declare that this class belongs to the package `tech_tasks`, which is used to organize related classes.
package tech_tasks;

/*

Describe a method that will output numbers from
- 0 to 50 all multiples of 3 change to Fizz,
- multiples of 5 to Buzz,
- multiples of 3 and 5 to FizzBuzz.

*/

// Define a public class named `FizzBuzz`. This class will contain the logic to run the FizzBuzz program.
public class FizzBuzz {

    // The `main` method is the entry point of the Java application. It's where the execution of the program starts.
    public static void main(String[] args) {

        // Calls the static method `printFizzBuzz()` which contains the logic for FizzBuzz.
        printFizzBuzz();
    }

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

                System.out.println("tech_tasks.FizzBuzz");
                fizzBuzzCount++;  // Increment the FizzBuzz counter.

                // If 'i' is divisible by both 3 and 5, it prints "tech_tasks.FizzBuzz" to the console.
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
