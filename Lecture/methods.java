package Lecture;

public class methods {

    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 15;


//...... we use object of that class ! if we use method without static.....//
        methods m = new methods();         
        System.out.println(m.max(a, b));
    }

}
