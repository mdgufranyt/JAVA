package Lecture;

public class re2 {
    public static void main(String[] args) {

        // int b = 101011;
        // String bin =b+"";
        // System.out.println(bin.matches("[01]+"));

        // String hex = "1234A";
        // System.out.println(hex.matches("[0-9A-F]+"));


        
        String str = "a!B@c#12%5";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", " "));


        String str1 = "MD      Gufran";
        System.out.println(str1.replaceAll("\\s+", " "));

        String str2 = "Hello, My Name is MD Gufran";
        str = str2.replaceAll("\\s+", " ").trim();

        String Words[] = str.split("\\s");
        System.out.println(Words.length);


       

      

        
    }
    
}
