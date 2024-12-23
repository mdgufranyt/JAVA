package StudentChallenge.Loops;
import java.util.Scanner;

// Reverse a Number

public class loops7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int rev = 0;
        int r;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        }
        System.out.println(rev);

        sc.close();

    }

}
