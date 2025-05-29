package Threadingss;
Class MyRunnable implements Runnable{

    public void run()
    {
        System.out.println("thread running");
    }

}


public class ImplementingRunnableInterface {

    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(Runnable);
        t.start();
    }
}
