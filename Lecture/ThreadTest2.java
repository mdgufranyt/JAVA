package Lecture;

public class ThreadTest2 implements Runnable {

    public void run() {
        
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }


    }

    public static void main(String[] args) {
        ThreadTest2 m = new ThreadTest2();
        Thread t = new Thread(m);
        t.start();
       

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }

    }

}
