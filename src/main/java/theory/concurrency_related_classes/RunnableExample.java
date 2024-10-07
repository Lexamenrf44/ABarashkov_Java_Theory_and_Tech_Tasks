package main.java.theory.concurrency_related_classes;

/*

Runnable

A functional interface representing a task to be executed by a thread.
Commonly used for defining a task in multithreaded applications.

*/

public class RunnableExample implements Runnable {
    // Implement the run method to define the thread's task
    public void run() {
        System.out.println("Runnable is running");
    }

    public static void main(String[] args) {
        // Create a Runnable instance
        RunnableExample runnable = new RunnableExample();

        // Create a Thread with the Runnable instance
        Thread thread = new Thread(runnable);

        // Start the thread
        thread.start();  // Output: Runnable is running
    }
}
