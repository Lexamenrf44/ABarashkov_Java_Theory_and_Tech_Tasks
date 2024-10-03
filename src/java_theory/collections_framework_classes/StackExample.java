package java_theory.collections_framework_classes;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a new Stack of integers
        Stack<Integer> stack = new Stack<>();

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
