package helpers;

public class OverloadMethod {

    // Method to add two integers
    public int add(int a, int b) {
        // Returns the sum of two integer values
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        // Returns the sum of three integer values
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        // Returns the sum of two double values
        return a + b;
    }

    // Overloaded method to add an integer and a double
    public double add(int a, double b) {
        // Converts integer 'a' to double and adds it to double 'b'
        return a + b;
    }
}
