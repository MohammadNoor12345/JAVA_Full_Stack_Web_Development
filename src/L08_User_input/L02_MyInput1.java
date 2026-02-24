package L08_User_input;
import java.util.Scanner;

public class L02_MyInput1 {
    static void main(String[] args) {
//        String s =new Scanner(System.in).next();
//        System.out.println(s);
//        char c = s.charAt(0);
//        System.out.println(c);


//        System.out.println("Enter One Char : ");
//        char c = new Scanner(System.in).next().charAt(0);
//        System.out.println(c);

        System.out.println("Enter In UpperCase : ");
        String str = new Scanner(System.in).next().toLowerCase();
        System.out.println(str);

    }
}
