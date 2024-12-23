package StudentChallenge.Loops;

import java.util.Scanner;

// Palindrome or Not 

public class loops8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int m = n;
        int rev = 0;
        int r;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        }
        if (rev == m) {
            System.out.println("Yes Its a Palindrome Number");
        } else {
            System.out.println("No Its Not a Palindrome Number ");

        }

        sc.close();

    }

}
