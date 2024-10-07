package main.java.theory.concurrency_related_classes;

import java.util.concurrent.Semaphore;

/*

Semaphore

Controls access to a resource with a fixed number of permits, allowing a limited number of threads to access the resource concurrently.

*/

public class SemaphoreExample {
    public static void main(String[] args) {
        // Create a Semaphore with 2 permits, allowing only 2 threads to access a resource at a time
        Semaphore semaphore = new Semaphore(2);

        // Simulate 5 threads trying to access a resource
        for (int i = 1; i <= 5; i++) {
            final int threadNumber = i;
            new Thread(() -> {
                try {
                    // Acquire a permit before accessing the resource
                    System.out.println("Thread " + threadNumber + " is waiting for a permit.");
                    semaphore.acquire();  // Waits if no permits are available
                    System.out.println("Thread " + threadNumber + " got a permit and is accessing the resource.");

                    // Simulate resource access with a sleep
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // Release the permit after finishing
                    System.out.println("Thread " + threadNumber + " has released the permit.");
                    semaphore.release();
                }
            }).start();
        }
    }
}

