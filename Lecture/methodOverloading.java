package Lecture;

public class methodOverloading {

    static int max(int x , int y){
        if (x>y) {
            return x;
            
        }
        else{
            return y;
        }
    }

    static int max(int x , int y, int z){
        if (x>y && x>z) {
            return x;
            
        }
        else if (y>z){
            return y;
        }
        else{
            return z;
        }
    }
    public static void main(String[] args) {
         
         System.out.println(max(10,20));

         System.out.println(max(10,20, 150));
    }
    
}
