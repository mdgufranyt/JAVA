package Lecture;

class MyThread extends Thread {

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

public class ThreadSleep {

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();
        t.interrupt();

    }

}
