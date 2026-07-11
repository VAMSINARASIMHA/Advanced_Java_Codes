package threads_in_java;

/*
Definition of volatile keyword in Java:-
The volatile keyword in Java is used to ensure that changes made to a variable by one thread are immediately visible to all other threads.
It is mainly used in multithreading to solve the visibility problem.


syntax:-
volatile dataType variableName;
example:-
volatile boolean bl = true;
*/


class MyThread extends Thread {

    volatile boolean running = true;

    public void run() {

        System.out.println("Thread Started");

        while (running) {

        }

        System.out.println("Thread Stopped");
    }
}

public class Volatile_In_Java {

    public static void main(String[] args) throws Exception {

        MyThread t = new MyThread();

        t.start();

        Thread.sleep(1000);

        t.running = false;

        System.out.println("Main Changed running to false");
    }
}
