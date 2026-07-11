package threads_in_java;

// class Test {
//     public static void main(String[] args) {
//         System.out.println(Thread.currentThread().getName());     //main
//         System.out.println(Thread.currentThread().getId());       //1
//     }
// }



// public class Threading_In_Java {
//     public static void main(String[] ar){
//         // Thread t = Thread.currentThread();
//         Thread t = new Thread();
//         t.start();    // here change the state of thread from new to runnable state.
//         Thread.currentThread().setName("Vamsi");
//         System.out.println(t.getState());
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(t.getClass());
//         // System.out.println(t.getId());
//         // System.out.println(t.getPriority());
//         // System.out.println(t.isAlive());
//         // System.out.println(t.isDaemon());
//         // System.out.println(t.isInterrupted());
//     }
// }




//Thread Example :-
// class MyThread extends Thread 
// {
//     public void run() 
//     {
//         System.out.println("Child Thread");

//     }
// }
// public class Threading_In_Java 
// {
//     public static void main(String[] args) //throws InterruptedException
//     {
//         MyThread t = new MyThread();
//         t.start();
//         // t.join(); // wait for child thread to complete
//         System.out.println("Main Thread");
//     }
// }













//Multithreading Example :-
class Download extends Thread 
{
    public void run()
    {

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Download");
            try
            {
                // Sleep method is used to pause the execution of the current thread for a specified amount of time (in milliseconds). In this case, it pauses the thread for 10 milliseconds.
                // in a simple way, Pauses thread temporarily.
                Thread.sleep(10);
            } 
            catch(InterruptedException e)
            {
                System.out.println("Something went wrong in Download thread");
                e.printStackTrace();
            }
            // System.out.println(Thread.currentThread().getName());
            // System.out.println(Thread.currentThread().threadId());
        }
    }
}

class Music extends Thread 
{
    public void run() 
    {

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Music");
             try
            {
                Thread.sleep(10);
            } 
            catch(InterruptedException e)
            {
                System.out.println("Something went wrong in Music thread");
                e.printStackTrace();
            }
            // System.out.println(Thread.currentThread().getName());
            // System.out.println(Thread.currentThread().threadId());
        }    
    }
}

public class Threading_In_Java
{
    public static void main(String[] args)
    {
        Download d = new Download();
        Music m = new Music();

        System.out.println(d.getPriority());
        m.setPriority(Thread.MAX_PRIORITY);
        // Thread.MIN_PRIORITY  //1
        // Thread.NORM_PRIORITY //5
        // Thread.MAX_PRIORITY  //10
        System.out.println(m.getPriority());

        d.start();
         try
            {
                Thread.sleep(5);
            } 
            catch(InterruptedException e)
            {
                System.out.println("Something went wrong in main thread");
                e.printStackTrace();
            }
        m.start();


        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());
        

    }
}


//yield() method in Java is a static method of the Thread class that is used to pause the execution of the current thread and allow other threads of the same priority to execute. When a thread calls yield(), it signals to the thread scheduler that it is willing to yield its current use of the CPU, allowing other threads of equal priority to run. However, it does not guarantee that the current thread will be paused immediately or that it will be resumed later.

// class MyThread extends Thread {

//     public void run() {

//         System.out.println("Child Started");

//         Thread.yield();

//         System.out.println("Child Finished");
//     }
// }

// public class Threading_In_Java {

//     public static void main(String[] args) {

//         MyThread t = new MyThread();

//         t.start();

//         System.out.println("Main Finished");
//     }
// }


