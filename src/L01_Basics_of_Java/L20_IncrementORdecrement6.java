package L01_Basics_of_Java;
public class L20_IncrementORdecrement6 {
    public static void main(String[] args) {
        int a = 20;
        int b = 22;
        int c = --a + --b + a++ + b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
