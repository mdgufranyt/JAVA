package Lecture;
public class Swapping {
    
    public static void main(String[] args) {
        int a = 9;
        int b = 12;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.print("A : " + a + " B : " + b);

    }

}
