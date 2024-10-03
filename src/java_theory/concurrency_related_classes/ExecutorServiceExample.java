package java_theory.concurrency_related_classes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*

ExecutorService

Part of the Java concurrency framework.
Used to manage a pool of worker threads, making it easier to run tasks concurrently.
Provides methods for executing tasks, managing their lifecycle, and shutting down the executor.

*/

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks to the executor
        executor.submit(() -> System.out.println("Task 1 is running"));
        executor.submit(() -> System.out.println("Task 2 is running"));

        // Shut down the executor after tasks completion
        executor.shutdown();
    }
}
