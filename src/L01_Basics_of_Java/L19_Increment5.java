package L01_Basics_of_Java;
public class L19_Increment5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a++ + b++ + ++b + ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
