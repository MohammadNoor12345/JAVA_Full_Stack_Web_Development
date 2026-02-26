package L15_MyStaticKeyword;

class MyStatic {

    static int x;
    static int y;

    static {
        System.out.println("inside static block");
        x = 10;
        y = 20;
    }

    public static void staticMethod() {
        System.out.println("inside static method");
        System.out.println("Accessing static variables");
        System.out.println(x);
        System.out.println(y);
    }

    int a;
    int b;

    {
        System.out.println("inside instance block");
        a = 100;
        b = 200;
    }

    public void instanceMethod() {
        System.out.println("inside instance method");
    }

    public MyStatic() {
        System.out.println("inside constructor");
        System.out.println("Accessing instance variables");
        System.out.println(a);
        System.out.println(b);
    }
}

public class L01_MyAlpha1 {

    public static void main(String[] args) {

        MyStatic.staticMethod();

        MyStatic m = new MyStatic();
        m.instanceMethod();
    }
}