package main.java.theory.examples.collections_framework_classes;

/*

PriorityQueue

Implements the Queue interface. Elements are stored according to their priority (natural ordering or custom comparator).
Useful for scenarios where you need to frequently access the element with the highest or lowest priority.

*/

public class PriorityQueue {
    public static void main(String[] args) {
        // Create a new PriorityQueue of integers (min-heap by default)
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();

        // Add elements to the queue
        priorityQueue.add(10);  // Adds 10
        priorityQueue.add(20);  // Adds 20
        priorityQueue.add(5);   // Adds 5 (smallest element)

        // Peek at the smallest element
        System.out.println(priorityQueue.peek());  // Output: 5 (smallest element)

        // Poll (remove and return) the smallest element
        System.out.println(priorityQueue.poll());  // Output: 5

        // Print the queue after polling
        System.out.println(priorityQueue);  // Output: [10, 20]
    }
}

