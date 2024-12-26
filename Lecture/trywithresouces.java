package Lecture;

import java.io.*;
import java.util.*;


public class trywithresouces {

    static FileInputStream fi;
    static Scanner sc;
    

    static void Divide() throws Exception
    {
       
        try(FileInputStream fi=new FileInputStream("/Users/moham/Desktop")
        {
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/c);
        }
        
    }

    public static void main(String[] args) throws Exception {

        try {
            Divide();

        } catch (Exception e) {
            System.out.println(e);
        }

        int x = sc.nextInt();

        System.out.println(x);

    }

}
