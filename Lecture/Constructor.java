package Lecture;

class Rectangle {

    private double length;
    private double breadth;

    Rectangle() {
        length = 1;
        breadth = 2;

    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;

    }

    public double area() {
        return length * breadth;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        Rectangle r1 = new Rectangle(10, 20);

        System.out.println("Area : " + r.area());
        System.out.println("Area : " + r1.area());

    }

}
