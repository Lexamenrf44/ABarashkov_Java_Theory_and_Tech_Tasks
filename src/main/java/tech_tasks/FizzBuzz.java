/*

Declare that this class belongs to the package `main.java.tech_tasks`,
which is used to organize related classes

*/

package tech_tasks;

import helpers.*;

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
        HelpMethods.printFizzBuzzWithCounter();
    }
}
