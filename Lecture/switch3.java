package Lecture;

import java.util.Scanner;

public class switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Website Name : ");
        String domain = sc.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".")+1);

        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "gov":
                System.out.println("government");
                break;
            case "in":
                System.out.println("Indian");
                break;

            default:
                System.out.println("Invalid ");
                break;
        }
        sc.close();

    }

}
