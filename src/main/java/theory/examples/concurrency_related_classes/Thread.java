package main.java.theory.examples.concurrency_related_classes;

/*

Thread

Represents a single thread of execution in a program.
Provides methods to start, stop, and manage threads.

*/

public class Thread extends java.lang.Thread {
    // Override the run method to define the thread's task
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread();

        // Start the thread
        thread.start();  // Output: Thread is running
    }
}
