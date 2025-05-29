package Threadingss;

public class ExtendingThreadClass extends Thread{

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {

    }
