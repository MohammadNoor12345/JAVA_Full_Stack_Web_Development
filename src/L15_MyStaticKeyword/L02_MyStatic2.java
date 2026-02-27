package L15_MyStaticKeyword;

public class L02_MyStatic2 {
    static int a = 1000;
    static  {
        System.out.println(a);
        System.out.println("Hello World");
        a = 100;
        System.out.println(a);
    }

    static void main(String[] args) {
        System.out.println("Inside main method");
    }
}
