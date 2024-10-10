package main.java.theory.examples.concurrency_related_classes;

/*

CountDownLatch

Enables one or more threads to wait until a set of operations being performed by other threads are completed.
It is often used to make one thread wait for other threads.

*/

public class CountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        // Create a CountDownLatch initialized with a count of 3
        java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(3);

        // Create and start 3 threads that will perform some work and then count down the latch
        for (int i = 1; i <= 3; i++) {
            final int workerId = i;
            new Thread(() -> {
                try {
                    System.out.println("Worker " + workerId + " is doing some work.");
                    Thread.sleep(1000);  // Simulate work with sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // Decrement the latch count
                    System.out.println("Worker " + workerId + " has finished work and is counting down.");
                    latch.countDown();
                }
            }).start();
        }

        // Main thread waits until the latch count reaches zero
        System.out.println("Main thread is waiting for workers to finish.");
        latch.await();  // Blocks until the count is 0

        // Once all workers are done
        System.out.println("All workers have finished. Main thread is proceeding.");
    }
}

