package main.java.theory.collections_framework_classes;

import java.util.Vector;

/*

Vector

Implements the List interface. Similar to ArrayList, but is synchronized (thread-safe), which makes it slower in single-threaded environments.
Historically used before ArrayList, now generally avoided unless thread safety is required.

*/

public class VectorExample {
    public static void main(String[] args) {
        // Create a new Vector of Strings
        Vector<String> vector = new Vector<>();

        // Add elements to the vector
        vector.add("First");   // Adds "First"
        vector.add("Second");  // Adds "Second"
        vector.addElement("Third");  // Adds "Third" (legacy method)

        // Print the vector
        System.out.println(vector);  // Output: [First, Second, Third]
    }
}

