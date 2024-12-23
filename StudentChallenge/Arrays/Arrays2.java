package StudentChallenge.Arrays;

import java.util.*;

// Seaching an element

public class Arrays2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Enter the an element : ");
        int key = sc.nextInt();

        for (int i = 0; i < A.length; i++) 
        {
            if (key == A[i]) {
                System.out.println("Element is Found at index " + i);
                System.exit(0);

            }

        }
        System.out.println("Element Not Found");
        sc.close();

    }

}
