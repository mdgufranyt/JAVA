package Lecture;

// Abstract Class..................
abstract class Super {

    Super() {
        System.out.println(" Super ");
    }

    public void meth1() {
        System.out.println(" Super Method 1 ");
    }

    abstract public void meth2();
}

// Concrete Class.................
class Sub extends Super {

    public void meth2() {
        System.out.println(" Sub Method 2 ");
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        Super s = new Sub();
        s.meth1();
        s.meth2();

    }

}
