package StudentChallenge.Arrays;

// Finding Sum of All Elements ....

public class Arrays1 {
    public static void main(String[] args) {

        int A[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;

        for(int i=0; i<A.length; i++){
            sum = sum+ A[i];
        }
        System.out.println("Sum is : "+sum);

    }

}
