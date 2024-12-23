package Lecture;

public class arrayMethod {

    static void update(int A[]) {
        A[0]=24;

    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6};         // created in heap !
        update(A);                      //  here array is object and it is passed as parameter, object is not passed, its reference is passed in                                  formal parameter...so update is actal data 
        System.out.println(A[0]);

        for(int i = 0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }
    
}
