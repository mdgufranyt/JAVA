package Lecture;

public class NestedCatch {

    public static void main(String[] args) {

        int A[] = { 10, 0, 8, 3, 5 };

        try {
            int r;
            r = A[0] / A[1];
            System.out.println("Division is " + r);

        } catch (ArithmeticException e) {
            System.out.println("Denominator can't be 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
        System.out.println("bye");

    }

}
