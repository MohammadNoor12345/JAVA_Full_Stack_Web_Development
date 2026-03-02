package L16_Abstraction;
abstract class MyAbstract{
    static int a = 10;
    static {
        System.out.println("Inside Static Block");
    }

    public static void m1() {
        System.out.println("Inside Static method");
    }
    int x = 100;
    {
        System.out.println("Inside Instance block");
    }
    public MyAbstract() {
        System.out.println("Inside Constructor");
    }

    public void m2() {
        System.out.println("Inside instance method");
    }
    public abstract void m3();
}

public class L04_MyNewClass {
    static void main(String[] args) {

    }
}
