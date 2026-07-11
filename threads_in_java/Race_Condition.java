package threads_in_java;


// Race Condition Definition :- A race condition occurs when two or more threads can access shared data and they try to change it at the same time, leading to unpredictable results.  (or) Multiple threads modify shared data at the same time, leading to incorrect results.

class display
{
    int count;
    synchronized public void show()
    {
        count++;
    }
}
public class Race_Condition
{

    public static void main(String[] args) throws InterruptedException 
    {
        display obj = new display();
        Runnable d = ()-> {
        for(int i = 1; i <= 10000; i++) 
        {
            obj.show();
        }
    };


        Runnable m = ()-> {
        for(int i = 1; i <= 10000; i++) 
        {
            obj.show();
        }
    };
        
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();
        


        // Wait for both threads to finish (or) Waits until another thread finishes.
        t1.join();
        t2.join();
        

        System.out.println(obj.count);
    }
}






// class Race_Condition extends Thread {

//     public void run() {

//         for(int i=1;i<=5;i++) {

//             System.out.println(i);

//             try {
//                 Thread.sleep(1000);
//             }
//             catch(Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     public static void main(String[] args) {

//         Race_Condition t = new Race_Condition();

//         t.start();
//     }
// }