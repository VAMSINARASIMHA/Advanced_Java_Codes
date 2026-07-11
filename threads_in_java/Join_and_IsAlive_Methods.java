package threads_in_java;

class MyThread extends Thread 
{
    public void run() 
    {
        System.out.println("Child Thread");

    }
}
public class Join_and_IsAlive_Methods
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t = new MyThread();
        t.start();
        System.out.println(t.isAlive());
        t.join(); // wait for child thread to complete
        System.out.println(t.isAlive());
        System.out.println("Main Thread");
    }
}



