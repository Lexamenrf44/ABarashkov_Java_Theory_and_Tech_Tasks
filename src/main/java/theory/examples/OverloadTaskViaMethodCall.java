package theory.examples;

import helpers.OverloadMethod;

public class OverloadTaskViaMethodCall {
    // Main method to test overloaded methods
    public static void main(String[] args) {
        // Create an instance of OverloadMethod
        OverloadMethod example = new OverloadMethod();

        // Calling add(int, int)
        int sumTwoIntegers = example.add(5, 3); // Expected output: 8
        System.out.println("Sum of two integers: " + sumTwoIntegers);

        // Calling add(int, int, int)
        int sumThreeIntegers = example.add(5, 3, 2); // Expected output: 10
        System.out.println("Sum of three integers: " + sumThreeIntegers);

        // Calling add(double, double)
        double sumTwoDoubles = example.add(5.5, 3.3); // Expected output: 8.8
        System.out.println("Sum of two doubles: " + sumTwoDoubles);

        // Calling add(int, double)
        double sumIntDouble = example.add(5, 3.3); // Expected output: 8.3
        System.out.println("Sum of an integer and a double: " + sumIntDouble);
    }

}
