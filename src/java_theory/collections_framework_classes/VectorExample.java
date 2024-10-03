package java_theory.collections_framework_classes;

import java.util.Vector;

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

