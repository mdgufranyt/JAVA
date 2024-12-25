package Lecture;

public class finallydemo {

    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        finally {
            System.out.println("Final Message");
        }
    }

}
