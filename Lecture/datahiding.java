package Lecture;

//.....Here we se setter and getter methodss .......//


class Rectangle {

    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {

        if (l > 0) {
            length = l;

        } else {
            length = 0;
        }

    }

    public void setBreadth(double b) {

        if (b > 0) {
            breadth = b;

        } else {
            breadth = 0;
        }
        
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

}

public class datahiding {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setBreadth(20);

        System.out.println("lenght of Rectangle : " + r.getLength());
        System.out.println("Breadth of Rectangle : " + r.getBreadth());

        System.out.println("Area : " + r.area());
        System.out.println("Perimeter : " + r.perimeter());

    }

}
