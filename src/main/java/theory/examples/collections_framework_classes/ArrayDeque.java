package main.java.theory.examples.collections_framework_classes;

/*

ArrayDeque

Implements the Deque interface. A resizable array-based double-ended queue (deque).
Can be used as a stack (LIFO) or a queue (FIFO), often preferred over Stack and LinkedList due to better performance.

*/

public class ArrayDeque {
    public static void main(String[] args) {
        // Create a new ArrayDeque of Strings (can be used as a stack or queue)
        java.util.ArrayDeque<String> deque = new java.util.ArrayDeque<>();

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

