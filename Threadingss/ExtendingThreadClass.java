package Threadingss;

public class ExtendingThreadClass extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {
        ExtendingThreadClass etc = new ExtendingThreadClass();
        etc.start();

        for (int j = 0; j < 3; j++) {
            System.out.println("parent thread");
        }
    }
}


