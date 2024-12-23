package Patterns;

public class Pattern6 {
    public static void main(String[] args) {

        int st = 5 / 2 + 1;
        int sp = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }

            if (i <= 5 / 2) {
                st--;
                sp += 2;

            } else {
                st++;
                sp -= 2;
            }

            System.out.println(" ");
        }

    }

}
