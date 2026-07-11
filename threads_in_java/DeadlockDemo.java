package threads_in_java;

class Resource {

}

class Thread1 extends Thread {

    Resource r1;
    Resource r2;

    Thread1(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {

        synchronized (r1) {

            System.out.println("Thread1 locked Resource 1");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Thread1 waiting for Resource 2");

            synchronized (r2) {

                System.out.println("Thread1 locked Resource 2");
            }
        }
    }
}

class Thread2 extends Thread {

    Resource r1;
    Resource r2;

    Thread2(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {

        synchronized (r2) {

            System.out.println("Thread2 locked Resource 2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Thread2 waiting for Resource 1");

            synchronized (r1) {

                System.out.println("Thread2 locked Resource 1");
            }
        }
    }
}

public class DeadlockDemo {

    public static void main(String[] args) {

        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread1 t1 = new Thread1(r1, r2);
        Thread2 t2 = new Thread2(r1, r2);

        t1.start();
        t2.start();
    }
}