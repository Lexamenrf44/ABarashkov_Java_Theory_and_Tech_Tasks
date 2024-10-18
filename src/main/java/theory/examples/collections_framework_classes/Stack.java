package theory.examples.collections_framework_classes;

/*

Stack

Extends the Vector class. Represents a last-in, first-out (LIFO) data structure.
Methods like push(), pop(), peek(), etc., are provided for stack operations.
Often replaced by the Deque interface and its implementations (ArrayDeque, LinkedList) for stack operations.

*/

public class Stack {

    public static void main(String[] args) {

        // Create a new Stack of integers
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        // Push elements onto the stack (LIFO)
        stack.push(10);  // Pushes 10 onto the stack
        stack.push(20);  // Pushes 20 onto the stack
        stack.push(30);  // Pushes 30 onto the stack

        // Peek at the top element without removing it
        System.out.println(stack.peek());  // Output: 30

        // Pop the top element (removes and returns it)
        System.out.println(stack.pop());  // Output: 30

        // Print the stack after popping
        System.out.println(stack);  // Output: [10, 20]
    }
}
