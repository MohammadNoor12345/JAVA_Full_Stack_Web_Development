package L01_Basics_of_Java;
public class L18_Increment4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a++ + b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
