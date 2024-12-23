package StudentChallenge.Arrays;

// Finding Second Largest element...

public class Arrays4 {
    public static void main(String[] args) {

        int A[]={233,345,35,46456,8,8789,7,94,4464,};

        int max1, max2 ;
        max1=max2= A[0];

        for (int i = 0; i < A.length; i++) {

            if (A[i]>max1) {

                max2=max1;
                max1 = A[i];
                
            } else if (A[i]>max2) {
                max2 = A[i];

            }
            
        }
        System.out.println("Second Largest Element is "+max2);


        
    }
    
}
