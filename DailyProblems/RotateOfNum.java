import java.util.Scanner;

public class RotateOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        System.out.println("Enter the Number of Rotations : ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;

        }

        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        int rot = r * mul + q;
        System.out.println(rot);

        sc.close();

    }

}
