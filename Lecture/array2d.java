package Lecture;

public class array2d {

    public static void main(String[] args) {

        int A[][] = new int[5][5];

        int b[][] = { { 1, 2, 3 }, { 2, 3, 5 }, { 5, 5, 7 } };

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println(" ");

        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");

            }
            System.out.println("");
        }
    }

}
