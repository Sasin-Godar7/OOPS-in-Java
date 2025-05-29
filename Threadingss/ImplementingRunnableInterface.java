package Threadingss;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread running");
    }
}

public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();      // object of class implementing Runnable
        Thread t = new Thread(m);             // pass the object to Thread
        t.start();                             // start the thread
    }
}
