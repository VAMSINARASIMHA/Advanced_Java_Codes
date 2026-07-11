package threads_in_java;

//Multithreading using Runnable Interface :-

class Download implements Runnable
{
    public void run()
    {

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Download");
            try
            {
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

class Music implements Runnable
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

public class Multithreading_Using_Runnable
{
    public static void main(String[] args) 
    {
        Download d = new Download();
        Music m = new Music();
         
            
     // Runnable d = new Download();
     // Runnable m = new Music();                   // these are also valid because Download and Music classes implement Runnable interface.
          
        
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();


        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());
        

    }
}








//Multithreading using Runnable Interface through Lambda Expressions :-

// public class Multithreading_Using_Runnable
// {

//     public static void main(String[] args) 
//     {
//         Runnable d = ()-> {
//             for(int i = 1; i <= 5; i++) {
//             System.out.println("Download");
//             try
//             {
//                 Thread.sleep(10);
//             } 
//             catch(InterruptedException e)
//             {
//                 System.out.println("Something went wrong in Download thread");
//                 e.printStackTrace();
//             }
//         }
//     };


//         Runnable m = ()-> {
//             for(int i = 1; i <= 5; i++) {
//             System.out.println("Music");
//              try
//             {
//                 Thread.sleep(10);
//             } 
//             catch(InterruptedException e)
//             {
//                 System.out.println("Something went wrong in Music thread");
//                 e.printStackTrace();
//             }
//         }
//     };
        
//         Thread t1 = new Thread(d);
//         Thread t2 = new Thread(m);

//         t1.start();
//         t2.start();

//     }
// }