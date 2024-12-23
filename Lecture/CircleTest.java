package Lecture;

 class circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;

    }
    public double perimeter(){
        return 2*Math.PI*radius;

    }
    public double circumferenece(){
        return perimeter();

    }
}


public class CircleTest {
    public static void main(String[] args) {

        circle c = new circle();
        circle c2 = new circle();

        c.radius = 7;
        c2.radius = 15;

        System.out.println("Area : "+c.area());
        System.out.println("Perimeter : "+c.perimeter());
        System.out.println("Circumference : "+c.circumferenece());

        System.out.println(" ");

        System.out.println("Area : "+c2.area());
        System.out.println("Perimeter : "+c2.perimeter());
        System.out.println("Circumference : "+c2.circumferenece());


        
    }
    
}
