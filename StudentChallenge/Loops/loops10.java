package StudentChallenge.Loops;

import java.util.Scanner;

// Ap Series ...............

public class loops10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, d and n");

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int term = a;
        for (int i = 0; i <= n; i++) {
            System.out.println(term + " ");
            term = term + d;
        }
        sc.close();

    }

}
