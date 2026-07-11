/*
1)definition of Daemon Thread :-
A daemon thread is a low-priority thread that runs in the background to perform tasks such as   garbage collection. It is a service provider thread that provides services to user threads.
                   (or)
A Daemon Thread is a low-priority background thread that performs supporting or service-related tasks for user (non-daemon) threads. It does not execute the main application logic.

The JVM does not wait for daemon threads to finish. As soon as all user threads have completed, the JVM automatically terminates, and any remaining daemon threads are stopped.                   

Examples of daemon threads:

Garbage Collector (GC)
Background logging
Auto-save services
Cache cleanup
Monitoring threads




I)How to Create a Daemon Thread:-

II)syntax:-

Thread t = new Thread();
t.setDaemon(true);
t.start();

Note :- to Create a Daemon Thread  ---->  """before starting the thread."""




III)Checking Whether a Thread is Daemon:-
System.out.println(Thread.currentThread().isDaemon());

*/



package threads_in_java;

class MyThread extends Thread {

    public void run() {

        System.out.println("Is Daemon : " + isDaemon());

        for (int i = 1; i <= 5; i++) {

            System.out.println("Daemon Thread : " + i);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
            }
        }
    }
}

public class Daemon_Thread {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.setDaemon(true);

        t.start();

        System.out.println("Main Thread Finished");
    }
}


