// A Scheduled Thread Pool is used when you want to execute a task: After a delay, or Periodically.

package threadpool_in_java;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Extra_Thread extends Thread {
    public void run() {

        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}

public class ThreadPool_Concept_2 {

    public static void main(String[] args) {
        ScheduledExecutorService obj = Executors.newScheduledThreadPool(3);
        obj.schedule(new Extra_Thread(), 2, TimeUnit.SECONDS);
        obj.schedule(() -> System.out.println("Hello vamsi"), 1, TimeUnit.SECONDS);
        obj.schedule(() -> System.out.println("Hello vamsi Narasimha"), 1, TimeUnit.MINUTES); // we should wait 1 minute
                                                                                              // for the output.
        obj.scheduleAtFixedRate(() -> System.out.println("Hai How are You"), 0, 2, TimeUnit.SECONDS);
        // obj.scheduleWithFixedDelay(null, 0, 0, null);

        for (int i = 0; i <= 5; i++) {
            obj.execute(new Extra_Thread());
        }
        obj.shutdown();
        obj.close();
    }
}
/*
 * // Another Scheduled Thread Pool Code Example :-
 * 
 * import java.util.concurrent.*;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * 
 * ScheduledExecutorService pool =
 * Executors.newScheduledThreadPool(2);
 * 
 * pool.schedule(
 * () -> System.out.println("Hello"),
 * 3,
 * TimeUnit.SECONDS
 * );
 * 
 * pool.shutdown();
 * }
 * }
 * 
 */

/*
 * Different types of TimeUnit values :-
 * 
 * TimeUnit.NANOSECONDS
 * TimeUnit.MICROSECONDS
 * TimeUnit.MILLISECONDS
 * TimeUnit.SECONDS
 * TimeUnit.MINUTES
 * TimeUnit.HOURS
 * TimeUnit.DAYS
 */

// 4) Single Thread Pool Example :-

// ---> A Single Thread Pool contains only one worker thread.

// ---> Here, Single Thread Pool useful for Tasks execute one after another. And
// it execute sequentially.

// ---> Here In This Single Thread Pool the Thread size is only one.

/*
 * 
 * Single Thread Pool Code Example :-
 * 
 * 
 * import java.util.concurrent.ExecutorService;
 * import java.util.concurrent.Executors;
 * 
 * class Extra_Thread extends Thread {
 * public void run() {
 * 
 * System.out.println("Task executed by " + Thread.currentThread().getName());
 * }
 * }
 * 
 * public class vvv {
 * 
 * public static void main(String[] args) {
 * ExecutorService executor = Executors.newFixedThreadPool(1);
 * 
 * for (int i = 0; i <= 5; i++) {
 * executor.execute(new Extra_Thread());
 * }
 * executor.shutdown();
 * executor.close();
 * }
 * }
 * 
 */
