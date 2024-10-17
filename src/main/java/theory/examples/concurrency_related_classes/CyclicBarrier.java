package theory.examples.concurrency_related_classes;

/*

CyclicBarrier

Enables a set of threads to wait for each other to reach a common barrier point.
Once all threads have called await(), they proceed together.

*/

public class CyclicBarrier {
    public static void main(String[] args) {
        // Create a CyclicBarrier that will trip (open) when 3 threads reach it
        java.util.concurrent.CyclicBarrier barrier = new java.util.concurrent.CyclicBarrier(3, () -> {
            // This task will be executed when the last thread reaches the barrier
            System.out.println("All parties have reached the barrier. Proceeding to the next stage.");
        });

        // Create and start 3 threads
        for (int i = 1; i <= 3; i++) {
            final int threadId = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + threadId + " is doing some work.");
                    Thread.sleep(1000 * threadId);  // Simulate work with varying sleep times

                    // Wait at the barrier until all parties have arrived
                    System.out.println("Thread " + threadId + " has reached the barrier.");
                    barrier.await();  // Blocks until all threads reach this point

                    System.out.println("Thread " + threadId + " is proceeding after the barrier.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

