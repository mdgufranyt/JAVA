package Lecture;

public class varargs {

    static void show(int... A) {
        for (int x : A) {
            System.out.print(x+" ");
        }
        System.out.println(" ");

    }
    

    static void showList(int Start, String...S){
        for(int i = 0; i< S.length; i++){
            System.out.println(Start +" "+ S[i]);
            Start++;

        }
    }

    public static void main(String[] args) {

        show();
        show(1,3,4);
        show (new int[] {10,20,30,40,50,60});
        
        showList(5, "Md Gufran", "Md Imran", "Nida", "Mantasha");

    }

}
