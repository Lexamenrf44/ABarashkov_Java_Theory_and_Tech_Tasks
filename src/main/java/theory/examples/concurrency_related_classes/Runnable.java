package main.java.theory.examples.concurrency_related_classes;

/*

Runnable

A functional interface representing a task to be executed by a thread.
Commonly used for defining a task in multithreaded applications.

*/

public class Runnable implements java.lang.Runnable {
    // Implement the run method to define the thread's task
    public void run() {
        System.out.println("Runnable is running");
    }

    public static void main(String[] args) {
        // Create a Runnable instance
        Runnable runnable = new Runnable();

        // Create a Thread with the Runnable instance
        Thread thread = new Thread(runnable);

        // Start the thread
        thread.start();  // Output: Runnable is running
    }
}
