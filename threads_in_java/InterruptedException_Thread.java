// Defination :- InterruptedException is a checked exception that occurs when a thread is waiting, sleeping, or otherwise blocked, and another thread tells it to stop waiting by interrupting it.
// In Simple Words :- One thread can interrupt another thread while it is sleeping/waiting.

package threads_in_java;

class Worker extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("Worker started...");

            for (int i = 1; i <= 10; i++) {

                System.out.println("Working... " + i);

                Thread.sleep(1000); // Worker sleeps for 1 second
            }

            System.out.println("Worker completed.");

        } catch (InterruptedException e) {

            System.out.println("Worker was interrupted!");

            // Restore the interrupted status
            Thread.currentThread().interrupt();
        }
    }
}

public class InterruptedException_Thread {

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();

        // Start the worker thread
        worker.start();

        // Let the worker work for 3 seconds
        Thread.sleep(3000);

        // Interrupt the worker
        System.out.println("Main thread: Interrupting worker...");
        worker.interrupt();

        System.out.println("Main thread finished.");
    }
}
