package Lecture;

//  Dynamic Method Dispatch 

class Super {

    public void meth1() {

        System.out.println(" Method 1");

    }

    public void meth2() {

        System.out.println(" Super Method 2");

    }
}

class Sub extends Super {

    @Override
    public void meth2() {
        System.out.println(" Sub Method 2");
    }

    public void meth3() {
        System.out.println(" Method 3");
    }

}

public class DynamicDispatch {

    public static void main(String[] args) {

        Super sup = new Sub();

        sup.meth1();
        sup.meth2();

    }

}