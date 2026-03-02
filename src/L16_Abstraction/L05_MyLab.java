package L16_Abstraction;

class Calci {

    public void add() {
        int a = 20;
        int b = 30;
        System.out.println("a + b = " + (a + b));
    }

    public void sub() {
        int a = 100;
        int b = 50;
        System.out.println("a - b = " + (a - b));
    }

    public void mul() {
        int a = 10;
        int b = 5;
        System.out.println("a * b = " + (a * b));
    }

    public void div() {
        int a = 40;
        int b = 8;
        System.out.println("a / b = " + (a / b));
    }
}

public class L05_MyLab {

    public static void main(String[] args) {

        Calci c = new Calci();

        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}