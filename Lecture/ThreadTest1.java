package Lecture;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        setPriority(MIN_PRIORITY);

    }
}

public class ThreadTest1 {

    public static void main(String[] args) {

        MyThread t = new MyThread("My Thread 1");

        System.out.println("ID : "+t.getId());
        System.out.println("Name : "+t.getName());
        System.out.println("Priority : "+t.getPriority());
        t.start();
        System.out.println("State : "+t.getState());
        System.out.println("Alive : "+t.isAlive());

    }

}
