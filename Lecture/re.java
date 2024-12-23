package Lecture;


public class re {

    public static void main(String[] args) {

        String str = "john@gmail.com";

        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domain = str.substring(i + 1, str.length());

        System.out.println("username :" + uname);
        System.out.println("doamin :" + domain);

        System.out.println(domain.startsWith("gmail.com"));

    }

}
