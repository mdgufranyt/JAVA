package Lecture;

class Circle {

    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}

class Cylinder extends Circle {

    public double height;

    public double volume() {
        return area() * height;
    }

}

public class Inheritance {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;

        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.volume());

    }

}
