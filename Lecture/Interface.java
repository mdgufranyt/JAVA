package Lecture;

interface test1 {

    void meth1();
    void meth2();
}

class test2 implements test1 {

    public void meth1(){
        System.out.println("Meth1 class test2");
    }
    public void meth2(){
        System.out.println("Meth2 class test2");
    }

}

public class Interface {

     public static void main(String[] args) {
        test1 t = new test2();
        t.meth1();
        t.meth2();

     }
}





  