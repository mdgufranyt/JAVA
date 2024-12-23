package Lecture;

public class arraypractice {

    public static void main(String[] args) {

        int A[] = new int[10];
        A[0] = 8;
        A[1] = 8;
        A[2] = 8;
        A[3] = 8;
        A[4] = 8;
        A[5] = 8;
        A[6] = 8;
        A[7] = 8;
        A[8] = 8;
        A[9] = 8;

        int B[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

    }

}
