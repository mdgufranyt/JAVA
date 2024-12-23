package StudentChallenge.Loops;

import java.util.Scanner;

// Armstrong Number Or Not ?

public class loops6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int m=n;
        int sum=0;
        int r;

        while (n > 0) {
            r = n % 10;
            n = n / 10;

            sum = sum + r * r * r;

           
        }

        if (sum == m) {
            System.out.println("Its a Armstrong number");
            
        }else{
            System.out.println("Its Not a Armstrong Number");
        }

        sc.close();

    }

}
