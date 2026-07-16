package threads_in_java;

class PrinterTask implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + ": Running task "+i);
        }
    }
}
public class Thread_Practice_Program 
{
    public static void main(String[] args) throws Exception 
    {    
            PrinterTask pt = new PrinterTask();           
            Thread t1 = new Thread(pt,"Worker-1");
            Thread t2 = new Thread(pt,"Worker-2");
       
                t1.start();
                t2.start();

              t1.join();
              t2.join();
        
    }
}

