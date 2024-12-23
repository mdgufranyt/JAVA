package StudentChallenge.Arrays;

 // Max Element .........
 
class Arrays3 {

    public static void main(String[] args) {

        int A[]={2,3,445,656,676,87,88};

        int max = A[0];

        for (int i = 0; i < A.length; i++) {

            if (A[i]>max) {
                max=A[i];
                
            }
            
        }
        System.out.println("MAX Element " + max + " is Found");

    }

}