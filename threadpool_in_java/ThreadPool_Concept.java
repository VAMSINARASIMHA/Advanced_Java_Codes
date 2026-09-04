// Java Thread Pool Creates a group of worker threads that are waiting for the job and thread reuse many times.
// Thread pool creates group of fixed size of threads or dynamic thread size.
// Thread pool provides better performance. and it saves time because there is no need to create a new thread.
// Once a thread was created, it will not die until that the task was completed.
// This Threas pool has 4 types i.e, :- 1)Fixed Thread Pool, 2)Cached Thread Pool, 3)Single Thread Pool, 4)Scheduled Thread Pool.

// 1) Fixed Thread Pool Code Example :-
// A Fixed Thread Pool has a fixed number of threads.

package threadpool_in_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Extra_Thread extends Thread {
    public void run() {

        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}

public class ThreadPool_Concept {

    public static void main(String[] args) {

        // Here, we pass Fixed number of Threads.
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // for (int i = 1; i <= 6; i++) {

        // executor.submit(() -> {
        // System.out.println(
        // "Task " + taskNumber +
        // " executed by " +
        // Thread.currentThread().getName());
        // });
        // }

        for (int i = 0; i <= 5; i++) {
            executor.execute(new Extra_Thread());
        }
        executor.shutdown();
        executor.close();
    }
}

/*
 * 
 * // Another Fixed Thread Pool Code Example.
 * 
 * import java.util.concurrent.*;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * 
 * ExecutorService pool = Executors.newFixedThreadPool(2);
 * 
 * pool.submit(() -> System.out.println("Task 1"));
 * pool.submit(() -> System.out.println("Task 2"));
 * pool.submit(() -> System.out.println("Task 3"));
 * pool.submit(() -> System.out.println("Task 4"));
 * 
 * pool.shutdown();
 * }
 * }
 * 
 */

// 2) Cached Thread Pool Example :-
// ---> Here, Cached Thread Pool create threads depends on requirements.

// ---> In this Cached Thread Pool, if thread is already created and it's not
// busy then it will execute next task.

// ---> In this Cached Thread Pool, if all created threads is busy then it will
// create a new thread for perform an operation.

/*
 * 2) Cached Thread Pool Example Code :-
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
 * public class Cached_Thread_Pool {
 * 
 * public static void main(String[] args) {
 * ExecutorService executor = Executors.newCachedThreadPool();
 * for (int i = 0; i <= 50; i++) {
 * executor.execute(new Extra_Thread());
 * }
 * executor.shutdown();
 * executor.close();
 * }
 * }
 * 
 */