import java.util.*;

public class InverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int op = 1;
        int id = 0;

        while (n > 0) {
            int od = n % 10;
            int ip = od;
            id = id + op * (int) Math.pow(10, ip - 1);
            op++;
            n = n / 10;

        }
        System.out.println("Inverse is "+id);

        sc.close();

    }
}
