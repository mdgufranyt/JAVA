package Lecture;

import java.util.Scanner;

public class WebsiteType {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URl");
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if (protocol.equals("https")) {
            System.out.println("Hypertext Transfer Protocol");
        } else {
            System.out.println("File Trasnfer protocol");
        }

        sc.close();

    }

}
