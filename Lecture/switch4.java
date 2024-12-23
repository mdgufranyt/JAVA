package Lecture;

import java.util.Scanner;

public class switch4 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Enter operation ---> Add/Sub/Mul/Div");
        String operation = sc.nextLine();

        String str = operation.toUpperCase();

        switch (str) {
            case "ADD": System.out.println("Sum is "+(x+y));
                        break;
            case "SUB": System.out.println("Sub is "+(x-y));
                        break;
            case "MUL": System.out.println("Mul is "+(x*y));
                        break;
            case "DIV": System.out.println("Div is "+(x/y));
                        break;
        
            default: System.out.println("Invalid Operation");
                break;
        }
        sc.close();
    }
    
}
