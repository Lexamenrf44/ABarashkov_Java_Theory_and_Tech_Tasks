package main.java.tech_tasks;

/*

Describe a method on Java that will swap the values of the variables without declaring new variables

*/

public class SwapValuesArithmetically {
    public static void swap(int x, int y) {

        // Step 1: Add x and y, and assign the result to x
        x = x + y;  // Now, x holds the sum of x and y

        // Step 2: Subtract y from x (which is now x + y), and assign the result to y
        y = x - y;  // Now, y holds the original value of x

        // Step 3: Subtract the new value of y from x (which is still x + y), and assign the result to x
        x = x - y;  // Now, x holds the original value of y

        // Output the swapped values
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {

        // Arbitrary values for x and y
        int x = 5;
        int y = 10;

        // Print the original values
        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Call the swap method to swap x and y
        swap(x, y);
    }
}
