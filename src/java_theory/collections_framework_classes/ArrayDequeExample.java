package java_theory.collections_framework_classes;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create a new ArrayDeque of Strings (can be used as a stack or queue)
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back
        deque.addFirst("First");  // Adds "First" to the front
        deque.addLast("Last");    // Adds "Last" to the back

        // Print the deque
        System.out.println(deque);  // Output: [First, Last]

        // Remove the first element
        deque.removeFirst();  // Removes "First"

        // Print the deque after removing the first element
        System.out.println(deque);  // Output: [Last]
    }
}

